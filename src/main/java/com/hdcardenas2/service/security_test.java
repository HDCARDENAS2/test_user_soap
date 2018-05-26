/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdcardenas2.service;

import com.google.gson.Gson;
import com.hdcardenas2.dao.RollDaoImpl;
import com.hdcardenas2.dao.UsersDaoImpl;
import com.hdcardenas2.model.Roll;
import com.hdcardenas2.model.Users;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hernandario
 */
@WebService(serviceName = "security_test")
public class security_test {

    /**
     * Login app
     * @param claveApp
     * @param MantenerSesionactiva
     * @param nombreApp
     * @param pass
     * @param usuario
     * @return 
     */
    
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "claveApp") String claveApp, @WebParam(name = "MantenerSesionactiva") String MantenerSesionactiva, @WebParam(name = "nombreApp") String nombreApp, @WebParam(name = "pass") String pass, @WebParam(name = "usuario") String usuario) {
       
        Gson gson = new Gson();
        String json = null;
        UsersDaoImpl dao_user = new UsersDaoImpl();
        Map<String,Object> map = new HashMap<String,Object>();
      
        Users o_user = dao_user.fn_rolls_user(usuario, pass);
        
        if(o_user == null){
             map.put("error", "The user no exists!!");
        }else{        
             RollDaoImpl dao_roll = new RollDaoImpl();
             List<Roll> o_rolls_user = dao_roll.fn_rolls_user(o_user.getId().toString());
             map.put("result", o_rolls_user);     
        } 
        json = gson.toJson( map );
        return json;
    }
}

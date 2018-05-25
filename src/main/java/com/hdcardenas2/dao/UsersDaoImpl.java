/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdcardenas2.dao;

import com.hdcardenas2.Util.LlaveValor;
import com.hdcardenas2.model.Users;
import java.util.ArrayList;
import java.util.List;
/*
 * @author hdcardenas dropimax@gmail.com
 */
public class UsersDaoImpl extends GenericDaoImpl<Users, Integer> implements UsersDao{

    @Override
    public Users fn_rolls_user(String user,String password){
    
        List<Users> temp = null;
        
        try{ 
            
            String query = "SELECT us.Id FROM users as us WHERE us.user = :p_user and us.password = :p_password";
            
            ArrayList<LlaveValor> parametros = new ArrayList<>();
            parametros.add(new LlaveValor("p_user", user)); 
            parametros.add(new LlaveValor("p_password", password)); 
            temp = this.Query(query, parametros,Users.class);
            
        } catch (Exception e) {
            throw e;
        }
        
        Users result = temp.isEmpty() ? null  : temp.get(0);
        
        return result;
  
    }
    
}

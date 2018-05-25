/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdcardenas2.dao;

import com.hdcardenas2.Util.LlaveValor;
import com.hdcardenas2.model.Roll;
import java.util.ArrayList;
import java.util.List;
/*
 * @author hdcardenas dropimax@gmail.com
 */
public class RollDaoImpl extends GenericDaoImpl<Roll, Integer> implements RollDao{
    
    @Override
    public List<Roll> fn_rolls_user(String id_user){
    
        List<Roll> resultado = null;
        
        try{ 
            
            String query = " SELECT rl.Id,rl.Name FROM roll as rl, detail_users_roll as dt WHERE dt.user_id = :p_id_user AND dt.roll_id = rl.id ";
            
            ArrayList<LlaveValor> parametros = new ArrayList<>();
            parametros.add(new LlaveValor("p_id_user", id_user)); 
            resultado = this.Query(query, parametros,Roll.class);
            
        } catch (Exception e) {
            throw e;
        }
        
        return resultado;
        
      
    }
    
}

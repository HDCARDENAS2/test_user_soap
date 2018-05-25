/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdcardenas2.dao;


import com.hdcardenas2.model.Users;

/*
 * @author hdcardenas dropimax@gmail.com
 */
public interface UsersDao extends GenericDao<Users, Integer>{
    
        public Users fn_rolls_user(String user,String password);
}

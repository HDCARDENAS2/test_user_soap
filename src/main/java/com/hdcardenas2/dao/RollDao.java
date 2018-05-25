/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdcardenas2.dao;


import com.hdcardenas2.model.Roll;
import java.util.List;

/*
 * @author hdcardenas dropimax@gmail.com
 */
public interface RollDao extends GenericDao<Roll, Integer>{
    public List<Roll> fn_rolls_user(String id_user);
}

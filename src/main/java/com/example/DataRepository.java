/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 *
 * @author sergei
 */
@Transactional
public class DataRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplateObject;
    
    
    public List<DataDomian> getAllData(){
        return jdbcTemplateObject.query("select * from contacts", new DataMapper());
        
    }
}

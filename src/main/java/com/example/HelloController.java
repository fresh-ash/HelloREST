/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;



import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sergei
 */
@RestController
@ComponentScan
@EnableAutoConfiguration
public class HelloController {

    /**
     *
     * 
     * @return
     */
    @Autowired
    private DataService service;
    
    @RequestMapping(method = RequestMethod.GET, value = "/hello/{nameFilter}", headers = "Accept=application/json")
    @ResponseBody
    public List<ArrayList> getByData(@PathVariable String nameFilter){
        return service.searchName(nameFilter);
    }
   
}

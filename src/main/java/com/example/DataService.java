/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 *
 * @author sergei
 */
public class DataService {
   
    @Autowired
    private DataRepository repository;
    
    public List<ArrayList> searchName(String filter){
        List contacts = repository.getAllData();
        List<ArrayList> result = new ArrayList<>();
        for (Iterator it = contacts.iterator(); it.hasNext();) {
            DataDomian d = (DataDomian) it.next();
            if (d.getName().matches(filter)){
                List<String> group = new ArrayList<>();
                group.add("id:" + d.getId());
                group.add("name:" + d.getName());
                result.add((ArrayList) group);
            }
        }
        return result;
    }
}

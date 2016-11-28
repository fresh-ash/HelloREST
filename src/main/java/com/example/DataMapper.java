/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author sergei
 */
public class DataMapper implements RowMapper<DataDomian>{
    
    @Autowired
    private DataDomian data;
    
    public DataDomian mapRow(ResultSet rs, int rowNum) throws SQLException {
      data.setId(rs.getInt("id"));
      data.setName(rs.getString("name"));
      return data;
}
}

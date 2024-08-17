package com.toyProjcet.toyProject.controller;

import com.toyProjcet.toyProject.domain.DBConnTest;
import com.toyProjcet.toyProject.service.DBConnTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    DBConnTestService dbConntestService;

    @GetMapping("/api/hello")
    public String test() throws Exception{
        List<DBConnTest> list =  dbConntestService.getDBConnTest();

        StringBuilder s = new StringBuilder();

        for(DBConnTest dbConnTest : list) {
            s.append(String.valueOf(dbConnTest.getTestId()));
        }

        return s.toString();
    }
}

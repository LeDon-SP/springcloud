package com.le.controller;

import com.le.entity.Student;
import com.le.feign.FeignPrividerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignPrividerClient feignPrividerClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignPrividerClient. findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignPrividerClient.index();
    }
}

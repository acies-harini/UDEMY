package com.harini.SampleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertyController {

    //Restful webservice example : mapping an url to a java class methods and convert it as a restful api
    // which can be used by http protocol. http://localhost:8080/api/v1/properties/name
    @GetMapping("/name")
    public String sayname(){

        return "My Name is Harini";
    }
}

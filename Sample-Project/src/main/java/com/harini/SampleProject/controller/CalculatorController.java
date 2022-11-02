package com.harini.SampleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculator") //class level mapping of url to hit controller class.
public class CalculatorController {
    @GetMapping("/add") //method level mapping of an url to hit controller fn.
    public Double add(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        return num1+num2;
        
    }
}

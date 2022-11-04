package com.harini.SampleProject.controller;

import com.harini.SampleProject.dto.CalculatorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator") //class level mapping of url to hit controller class.
public class CalculatorController {

    //http://localhost:8080/api/v1/calculator/add?num1=5.1&num2=14.0
    @GetMapping("/add") //method level mapping of an url to hit controller fn by requestparam.
    public Double add(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        return num1+num2;
        
    }
    //http://localhost:8080/api/v1/calculator/sub/5.8/4.8
    @GetMapping("/sub/{num1}/{num2}") //map the values of url to java variable by path variable.
    public Double subtract(@PathVariable("num1") Double num1,@PathVariable("num2") Double num2){
        Double result = null;
        if(num1>num2){
            result=num1-num2;
        }
        else{
            result= num2-num1;
        }
        return result;
    }
    @GetMapping("/add/{num3}") //method level mapping of an url to hit controller fn by requestparam.
    public Double add(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2,@PathVariable("num3") Double num3){
        return num1+num2;

    }
    @PostMapping("/mul")
    public Double multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum1()*calculatorDTO.getNum2()*calculatorDTO.getNum3()*calculatorDTO.getNum4()*calculatorDTO.getNum5()*calculatorDTO.getNum6();
        return result;
    }
}

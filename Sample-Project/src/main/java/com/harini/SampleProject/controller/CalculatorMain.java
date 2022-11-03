package com.harini.SampleProject.controller;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorController cc = new CalculatorController();
        Double result = cc.add(5.7,5.7,6.0);
        System.out.println(result);
    }
}

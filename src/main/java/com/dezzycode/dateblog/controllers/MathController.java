package com.dezzycode.dateblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ResourceBundle;

@Controller
public class MathController {

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtractNums(@PathVariable int num1, @PathVariable int num2){
        return num1 / num2;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiplyNums(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public int divideNums(@PathVariable int num1, @PathVariable int num2){
        return num1 / num2;
    }

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int addNums(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }
}

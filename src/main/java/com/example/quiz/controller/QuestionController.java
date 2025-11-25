/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.quiz.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author YadavK
 */
@RestController
@RequestMapping("question")
public class QuestionController {
    
    @GetMapping("/allQuestion")
    public String getAllQuestion(){
        return "Hi,These are our app";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.quiz;

/**
 *
 * @author YadavK
 */
@RestController
@RwquestMapping("question")
public class QuestionController {
    
    @GetMapping("/allQuestion")
    public String getAllQuestion(){
        return "Hi,These are our app"
    }

}

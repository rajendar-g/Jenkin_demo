package com.jenkinEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
    @GetMapping("/")
    public  String helloJenkin(){
         System.out.println("Hi this is jenkin app ");
        return "Hi this is jenkin app ";
    }

    @PostMapping("/jenkin")
    public  void printJenkin(@RequestParam (required = false, defaultValue = "Hi this is jenkin  print") String s){
        System.out.println(s);
    }
}

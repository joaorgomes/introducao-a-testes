package br.edu.ifpb.testeunitario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {


    @GetMapping("/message")
    public String geMessage(){
        return "Eu consegui";
    }

    
}

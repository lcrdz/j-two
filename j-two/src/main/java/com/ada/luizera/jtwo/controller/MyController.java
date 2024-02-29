package com.ada.luizera.jtwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/ols")
    public People hello(@PathVariable String ocupacao) {

        People luizera = new People("Luizera", "professor");
        People alex = new People("Alex", "aluno");

        if (ocupacao == "professor") {
            return luizera;
        } else if (ocupacao == "aluno") {
            return alex;
        } else {
            throw new RuntimeException();
        }
    }
}

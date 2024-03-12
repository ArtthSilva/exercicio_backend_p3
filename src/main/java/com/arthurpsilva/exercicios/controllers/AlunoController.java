package com.arthurpsilva.exercicios.controllers;
import com.arthurpsilva.exercicios.models.Aluno;
import com.arthurpsilva.exercicios.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Aluno aluno) {
        alunoService.create(aluno);

    }
}
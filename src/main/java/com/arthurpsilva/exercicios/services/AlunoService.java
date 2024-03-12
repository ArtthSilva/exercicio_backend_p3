package com.arthurpsilva.exercicios.services;

import com.arthurpsilva.exercicios.models.Aluno;
import com.arthurpsilva.exercicios.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void create(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
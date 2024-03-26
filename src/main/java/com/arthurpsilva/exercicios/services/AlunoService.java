package com.arthurpsilva.exercicios.services;

import com.arthurpsilva.exercicios.models.Aluno;
import com.arthurpsilva.exercicios.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void create (Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();

    }

    public Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }

    public void update(Long id, Aluno aluno) {
        Optional<Aluno> alunoFromDb = findById(id);

        if (alunoFromDb.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Aluno alunoUptdated = alunoFromDb.get();
        alunoUptdated.setName(aluno.getName());
        alunoUptdated.setEmail(aluno.getEmail());
        alunoRepository.save(alunoUptdated);
    }

    public void deleteById(Long id) {alunoRepository.deleteById(id);}
}
package com.arthurpsilva.exercicios.repositories;

import com.arthurpsilva.exercicios.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
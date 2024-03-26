package com.arthurpsilva.exercicios.repositories;

import com.arthurpsilva.exercicios.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
package com.arthurpsilva.exercicios.repositories;
import com.arthurpsilva.exercicios.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
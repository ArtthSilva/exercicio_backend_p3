package com.arthurpsilva.exercicios.services;
import com.arthurpsilva.exercicios.models.Professor;
import com.arthurpsilva.exercicios.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public void create(Professor professor) {professorRepository.save(professor);
    }

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(Long id){
        return professorRepository.findById(id);
    }

    public void update(Long id, Professor professor){
        Optional<Professor>professorFromDb = findById(id);

        if (professorFromDb.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Professor não encontrado no banco de dados.");
        }

        Professor professorUpdated = professorFromDb.get();

        professorUpdated.setName(professor.getName());
        professorUpdated.setEmail(professor.getEmail());

        professorRepository.save(professorUpdated);
    }
    public void deleteById(Long id){
        professorRepository.deleteById(id);
    }
}

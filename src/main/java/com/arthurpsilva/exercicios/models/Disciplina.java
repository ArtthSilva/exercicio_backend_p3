package com.arthurpsilva.exercicios.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public void setName(String x) {this.name = x; }
    public String getName() {return this.name; }

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
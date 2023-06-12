package com.example.spring_curso2_Artifact.Repository;

import com.example.spring_curso2_Artifact.Models.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}

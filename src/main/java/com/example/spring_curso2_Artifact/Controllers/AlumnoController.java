package com.example.spring_curso2_Artifact.Controllers;

import com.example.spring_curso2_Artifact.Models.Alumno;
import com.example.spring_curso2_Artifact.Repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/alumno")
    public String getAlumno(Model model){
        model.addAttribute("alumnosVariable222", alumnoRepository.findAll());

        return "verAlumno";
    }
}

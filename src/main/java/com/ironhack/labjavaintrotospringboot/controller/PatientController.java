package com.ironhack.labjavaintrotospringboot.controller;

import com.ironhack.labjavaintrotospringboot.model.user.Patient;
import com.ironhack.labjavaintrotospringboot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> getAllPatients() { return patientService.getAllPatients(); }
}

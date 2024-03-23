package com.ironhack.labjavaintrotospringboot.controller;

import com.ironhack.labjavaintrotospringboot.model.user.Doctor;
import com.ironhack.labjavaintrotospringboot.repository.DoctorRepository;
import com.ironhack.labjavaintrotospringboot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;
    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    @ResponseStatus(HttpStatus.OK)
    public List<Doctor> getAllDoctors() { return doctorService.getAllDoctors(); }

    @GetMapping("/doctors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Doctor getDoctorById(@PathVariable(name = "id") int doctorId) {
        Optional<Doctor> $doctor = doctorRepository.findById(doctorId);
        if ($doctor.isPresent()) {
            return $doctor.get();
        }
        throw new ResponseStatusException(NOT_FOUND, "Unable to find resource");
    }
}

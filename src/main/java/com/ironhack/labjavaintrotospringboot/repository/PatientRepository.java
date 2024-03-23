package com.ironhack.labjavaintrotospringboot.repository;

import com.ironhack.labjavaintrotospringboot.model.user.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}

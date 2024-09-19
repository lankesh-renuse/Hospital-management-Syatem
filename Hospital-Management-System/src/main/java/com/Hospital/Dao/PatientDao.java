package com.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {

}

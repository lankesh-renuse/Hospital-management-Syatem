package com.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.Dao.PatientDao;
import com.Hospital.Entity.Patient;

import jakarta.transaction.Transactional;

@Service
public class PatientServiceImp implements PatientService {

	@Autowired
	PatientDao dao;
	
	@Override
	public Patient createPatient(Patient pai) {
		return dao.save(pai);
	}

	@Override
	public List<Patient> getall() {
		return dao.findAll();
	}

}

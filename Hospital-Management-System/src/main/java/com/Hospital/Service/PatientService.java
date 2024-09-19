package com.Hospital.Service;

import java.util.List;

import com.Hospital.Entity.Patient;

public interface PatientService {
	
	public Patient createPatient(Patient pai);
	public List<Patient> getall();


}

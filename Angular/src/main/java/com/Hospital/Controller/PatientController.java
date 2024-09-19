package com.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Entity.Patient;
import com.Hospital.Service.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/p")
public class PatientController {
	
@Autowired
PatientService service;

	@PostMapping("/Patient")
	public String createpatient(@RequestBody Patient pai) {
	service.createPatient(pai);
		return "created";
	}
	
	@GetMapping
	public List<Patient> getall(){
		return service.getall();
	}
	
}

package com.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Entity.Appointment;
import com.Hospital.Service.AppointmentService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/a")
public class AppointmentController {
	
	@Autowired
	AppointmentService service ;
	
	@PostMapping("/Appo")
	public String addapp(@RequestBody Appointment app) {
		service.addapp(app);
		return "added";
	}
	
	@GetMapping()
public List<Appointment> getall(){
		return service.getall();
	}
	
	
}

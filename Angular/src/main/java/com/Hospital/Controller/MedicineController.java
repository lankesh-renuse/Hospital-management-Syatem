package com.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Entity.Medicine;
import com.Hospital.Service.MedicineService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/m")
public class MedicineController {


	@Autowired
	MedicineService service ;
	
	@PostMapping("/medicine")
	public String addmedicine(@RequestBody Medicine med) {
		service.addmedicine(med);
	return "added";
	}
	
	@GetMapping
	public List<Medicine> getall(){
		return service.getall();
	}
}

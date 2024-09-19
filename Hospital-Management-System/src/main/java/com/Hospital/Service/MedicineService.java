package com.Hospital.Service;

import java.util.List;

import com.Hospital.Entity.Medicine;

public interface MedicineService {
	
	public Medicine addmedicine(Medicine med);
	public List<Medicine> getall();

}

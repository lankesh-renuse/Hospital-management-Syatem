package com.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.Dao.MedicineDao;
import com.Hospital.Entity.Medicine;

@Service
public class MedicineServiceImp implements MedicineService {

	@Autowired
	MedicineDao dao;
	
	@Override
	public Medicine addmedicine(Medicine med) {
		return dao.save(med);
	}

	@Override
	public List<Medicine> getall() {
		return dao.findAll();
	}

}

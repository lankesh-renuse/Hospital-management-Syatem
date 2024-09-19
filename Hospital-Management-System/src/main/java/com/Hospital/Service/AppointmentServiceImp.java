package com.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.Dao.AppointmentDao;
import com.Hospital.Entity.Appointment;

import jakarta.transaction.Transactional;

@Service
public class AppointmentServiceImp  implements AppointmentService{

	@Autowired
	AppointmentDao dao;
	
	@Override
	@Transactional
	public Appointment addapp(Appointment app) {
		return dao.save(app);
	}

	@Override
	@Transactional
	public List<Appointment> getall() {
		return dao.findAll();
	}

}

package com.Hospital.Service;

import java.util.List;

import com.Hospital.Entity.Appointment;

public interface AppointmentService {
	
	public Appointment addapp(Appointment app);
	public List<Appointment>getall();

}

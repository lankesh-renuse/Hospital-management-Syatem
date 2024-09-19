package com.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Entity.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long> {

}

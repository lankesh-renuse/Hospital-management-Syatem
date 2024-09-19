package com.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Entity.Medicine;

@Repository
public interface MedicineDao  extends JpaRepository< Medicine , Long>{

}

package com.jsp.Springboothospitalmanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Springboothospitalmanagement.dto.Hospital;
import com.jsp.Springboothospitalmanagement.repository.HospitalRepository;

@Repository
public class HospitalDao {
	@Autowired
	HospitalRepository hospitalRepository;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}
	
	public Hospital getHospitalById(int id) {
		Optional<Hospital> hospital = hospitalRepository.findById(id);
		if (hospital != null) {
			return hospital.get();
		}else {
			return null;
		}
	}
	
	public List<Hospital> getAllHospital(){
		return hospitalRepository.findAll();
	}
	
	public boolean deleteHospitalByID(int id) {
		Optional<Hospital>hospital = hospitalRepository.findById(id);
		if(hospital != null) {
			hospitalRepository.delete(hospital.get());
			return true;
		} else {
			return false;
		}
	}
	
	public Hospital updateHospital(int id, Hospital hospital) {
		Optional<Hospital>opt = hospitalRepository.findById(id);
		if(opt.isPresent()) {
			return hospitalRepository.save(hospital);
		}else {
			return null;
		}
	}
}

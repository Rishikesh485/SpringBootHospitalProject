package com.jsp.Springboothospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Springboothospitalmanagement.dao.HospitalDao;
import com.jsp.Springboothospitalmanagement.dto.Hospital;

@Service
public class HospitalService {
	@Autowired
	HospitalDao hospitalDao;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDao.saveHospital(hospital);
	}
	
	public List<Hospital> getAllHospital(){
		return hospitalDao.getAllHospital();
	}
	
	public Hospital getHospitalById(int id) {
		return hospitalDao.getHospitalById(id);
	}
	public boolean deleteHospitalById(int id) {
		return hospitalDao.deleteHospitalByID(id);
	}
	
	public Hospital UpdateHospital(int id, Hospital hospital) {
		Hospital h = hospitalDao.getHospitalById(id);
		h.setPname(hospital.getPname());
		h.setPemail(hospital.getPemail());
		h.setPaddress(hospital.getPaddress());
		h.setPlocation(hospital.getPlocation());
		h.setPissue(hospital.getPissue());
		h.setPblood(hospital.getPblood());
		if(h != null) {
			return hospitalDao.updateHospital(id, h);
		}else {
			return null;
		}
	}
}

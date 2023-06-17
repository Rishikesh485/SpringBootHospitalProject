package com.jsp.Springboothospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Springboothospitalmanagement.dto.Hospital;
import com.jsp.Springboothospitalmanagement.service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/hospitals")
	public Hospital saveHospital(@RequestBody Hospital hospital) {
		return hospitalService.saveHospital(hospital);
	}
	
	@GetMapping("/hospitals/{id}")
	public Hospital getHospitalByID(@PathVariable int id) {
		return hospitalService.getHospitalById(id); 
	}
	@GetMapping("/hospitals")
	public List<Hospital> getAllHospital(){
		return hospitalService.getAllHospital();
	}
	
	@DeleteMapping
	public boolean deleteHospitalById(@PathVariable int id) {
		return hospitalService.deleteHospitalById(id);
	}
	
	@PutMapping("/hospitals/{id}")
	public Hospital updateHospitalById(@PathVariable int id , @RequestBody Hospital hospital) {
		return hospitalService.UpdateHospital(id, hospital);
	}
	
}

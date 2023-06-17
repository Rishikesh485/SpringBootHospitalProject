package com.jsp.Springboothospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Springboothospitalmanagement.dto.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}

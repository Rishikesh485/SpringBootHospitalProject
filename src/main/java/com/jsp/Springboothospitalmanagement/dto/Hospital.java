package com.jsp.Springboothospitalmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String pname;
	private String pemail;
	private String paddress;
	private String plocation;
	private String pissue;
	private String pblood;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public String getPissue() {
		return pissue;
	}
	public void setPissue(String pissue) {
		this.pissue = pissue;
	}
	public String getPblood() {
		return pblood;
	}
	public void setPblood(String pblood) {
		this.pblood = pblood;
	}
	
	
	
}

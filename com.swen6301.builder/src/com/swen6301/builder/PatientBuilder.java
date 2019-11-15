package com.swen6301.builder;

public interface PatientBuilder {
	public void assignFirstName();
	public void assignMiddleName();
	public void assignlastName();
	public void assignAge();
	public void assignWeight();
	public void assignHight();
	public void assignSex();
	public void assignBloodType();
	public Patient getPatient();
}

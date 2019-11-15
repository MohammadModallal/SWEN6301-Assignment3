package com.swen6301.builder;

import com.swen6301.builder.util.PersistenceUtils;
import com.swen6301.builder.util.RandomUtils;

/**
 * 
 * A dummy driver class that simulates a driver class for this project.
 */
public class Driver {
	
	public static void main(String[] args) {
		
		// Create 1000 random samples.
		for(int i = 0; i < 1000; i++) {
			System.out.println("****************");
			createRandomPatientInfo();
			System.out.println("****************");
		}
	}
	
	/**
	 * Creates a sample patient info and store them on internal storage.
	 */
	public static void createRandomPatientInfo() {
		PatientBuilder patientBuilder=new NPatientBuilder();
		patientBuilder.assignFirstName();
		patientBuilder.assignMiddleName();
		patientBuilder.assignlastName();
		patientBuilder.assignAge();
		patientBuilder.assignWeight();
		patientBuilder.assignHight();
		patientBuilder.assignSex();
		patientBuilder.assignBloodType();
		System.out.println(patientBuilder.toString()); 
		
	}
	
}

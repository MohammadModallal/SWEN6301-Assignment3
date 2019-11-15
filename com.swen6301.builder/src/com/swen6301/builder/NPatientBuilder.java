package com.swen6301.builder;

import com.swen6301.builder.util.RandomUtils;

public class NPatientBuilder implements PatientBuilder{
	private Patient patient;

	
	
	public NPatientBuilder()
	{
		this.patient=new Patient();
	}

	@Override
	public void assignFirstName() {
		// TODO Auto-generated method stub
		this.patient.setFirstName(RandomUtils.randomIdentifier());
	}

	@Override
	public void assignMiddleName() {
		// TODO Auto-generated method stub
		this.patient.setMiddleName(RandomUtils.randomIdentifier());
		
	}

	@Override
	public void assignlastName() {
		// TODO Auto-generated method stub
		this.patient.setLastName(RandomUtils.randomIdentifier());
		
	}

	@Override
	public void assignAge() {
		// TODO Auto-generated method stub
		this.patient.setAge(RandomUtils.randomNumber(100));
		
	}

	@Override
	public void assignWeight() {
		// TODO Auto-generated method stub
		this.patient.setWeight(RandomUtils.randomNumber(200));

	}

	@Override
	public void assignHight() {
		// TODO Auto-generated method stub
		this.patient.setHight(RandomUtils.randomNumber(200));

	}

	@Override
	public void assignSex() {
		// TODO Auto-generated method stub
		this.patient.setSex(RandomUtils.randomSexString());

		
	}

	@Override
	public void assignBloodType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient getPatient() {
		// TODO Auto-generated method stub
		return this.patient;
	}

}

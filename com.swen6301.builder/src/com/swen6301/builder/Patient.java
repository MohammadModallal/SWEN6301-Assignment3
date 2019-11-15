package com.swen6301.builder;

import com.swen6301.builder.util.BloodTypesEnum;
import com.swen6301.builder.util.SexEnum;

public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int weight;
	private int hight;
	private String sex;
	private BloodTypesEnum bloodType;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public BloodTypesEnum getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodTypesEnum bloodType) {
		this.bloodType = bloodType;
	}
	
	public String toString()
	{
		String patientInfo="Name : "+this.getFirstName()+" "+this.getMiddleName()+" "+this.getLastName();
		patientInfo+="\nAge : "+this.getAge();
		patientInfo+="\nWeight : "+this.getWeight();
		patientInfo+="\nHight : "+this.getAge();
		patientInfo+="\nSex : "+this.getSex();
		patientInfo+="\nBlood Type : "+this.getBloodType();		
		return patientInfo;
	}
	
}

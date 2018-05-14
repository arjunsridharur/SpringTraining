package com.yaazli.springtraining.di.AppContext.Collections;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsBean implements CollectionInterface {

	String name;
	int age;
	Date d;
	List fruits;
	String colors[];
	Set phones;
	Map faculties;
	Properties capitals;
	String country;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public void setPhones(Set phones) {
		this.phones = phones;
	}

	public void setFaculties(Map faculties) {
		this.faculties = faculties;
	}

	public void setCapitals(Properties capitals) {
		this.capitals = capitals;
	}	

	public void setCountry(String country) {
		this.country = country;
	}

	public String sayHello() {
		return "Name-" + name + "," + "Age-" + age + "," + "Date-" + d + "," + "Fruits-" + fruits + "," + "Colors-"
				+ colors[0] + "," + colors[0] + "Phones-" + phones + "," + "Facilities-" + faculties + "," + "Capitals-"
				+ capitals + "," 
				+ "Country- " + country 

		;
	}

}

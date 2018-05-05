package com.core.cdac.utils;

import java.util.Calendar;

import com.core.cdac.exception.MyCustExce;
import com.core.cdac.people.Person;

public class Validater {
	
	public static final int YEARS_OF_EXPERIANCE;
	
	static{
		YEARS_OF_EXPERIANCE = 10;
	}
	
	public static void validateName(String fName, String lname, Person[] p, int c) throws Exception{
		String fullName = fName+lname;
		for (int i = 0; i < c; i++) {
			if(fullName.equals(p[i].getName())){
				throw new MyCustExce("Dublicate Name Occour");
			}
		}
	}
	
	public static void validateExperiance(int yrsOfExp) throws Exception{
		if(YEARS_OF_EXPERIANCE > yrsOfExp){
			throw new MyCustExce("Faculty Experiance must be more than 10");
		}
	}
	
	public static void validateCourse(String course) throws Exception{
		switch(course.toUpperCase()){
			case "DAC":
			case "DMC":
			case "DESD":
			case "DBDA":
				return;
			default:
				throw new MyCustExce("Invalid Course...");
		}
	}
	
	public static void validateYear(int gradYear) throws Exception{
		Calendar cal = Calendar.getInstance();
		if(gradYear <= (cal.get(Calendar.YEAR))  || gradYear > ((cal.get(Calendar.YEAR))-4)){
			return;
		}else{
			throw new MyCustExce("Invalid Year....");
		}
	}
}

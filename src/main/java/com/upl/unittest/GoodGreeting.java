package com.upl.unittest;

import java.util.Calendar;

public class GoodGreeting {

	private Time time;

	public GoodGreeting(Time time) {
		// TODO Auto-generated constructor stub
		this.time = time;
	}
	
	/* Morning: 0-11
	 * Afternoon: 12-17
	 * Evening: 18-22
	 * Night: 23*/
	public String sayHello() {
		Calendar current = time.getTime();
		if (current.get(Calendar.HOUR_OF_DAY) < 12) {
			return "Good Morning!";
		} else if (current.get(Calendar.HOUR_OF_DAY) < 18) {
			return "Good Afternoon!";
		} else if (current.get(Calendar.HOUR_OF_DAY) < 23) {
			return "Good Evening!";
		} else { 
			return "Good Night!";
		}
	}
}

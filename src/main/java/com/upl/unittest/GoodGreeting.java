package com.upl.unittest;

import java.util.Calendar;

public class GoodGreeting {

	private Time time;

	public GoodGreeting(Time time) {
		// TODO Auto-generated constructor stub
		this.time = time;
	}
	
	public String sayHello() {
		Calendar current = time.getTime();
		if (current.get(Calendar.HOUR_OF_DAY) < 12) {
			return "Good Morning!";
		} else {
			return "Good Afternoon!";
		}
	}
}

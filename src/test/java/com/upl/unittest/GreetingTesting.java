package com.upl.unittest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Calendar;

public class GreetingTesting {
	
	private GoodGreeting greeting;
	private Time time;
	
	@BeforeEach
	public void setUp() {
		time = mock(Time.class);
		greeting = new GoodGreeting(time);
	}
	
//	private static final Object[] morningHours() {
//		return $(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
//	}

	@Test
	@ParameterizedTest
	@ValueSource(ints = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})
	public void shouldSayGoodMorningInTheMorning(int morningHour) {
		when(time.getTime()).thenReturn(getCalendar(morningHour));
		assertEquals("Good Morning!", greeting.sayHello());
	}
	
//	private static final Object[] afternoonHours() {
//		return $(12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
//	}
	
	@Test
	@ParameterizedTest
	@ValueSource(ints = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23})
	public void shouldSayGoodAfternoonInTheAfternoon(int afternoonHour) {
		when(time.getTime()).thenReturn(getCalendar(afternoonHour));
		assertEquals("Good Afternoon!", greeting.sayHello());
	}
	
	private Calendar getCalendar(int hour) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, hour);
		return cal;
	}
}

package com.upl.unittest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTesting {
	
	private GoodGreeting greeting;
	private Time time;
	
	@BeforeEach
	public void setUp() {
		time = mock(Time.class);
		greeting = new GoodGreeting(time);
	}

}

package id.ifundip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloTest {

	@Test
	void test() {
		Hello hello = new Hello();
		String aktual = hello.sayHello();
		assertEquals("Hello", aktual);
	}

}

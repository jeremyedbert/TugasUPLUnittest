package id.ifundip.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class OrderTest {

	@Test
	void testSuccessPayment() {
		Order order = new Order();
		PaymentServiceProvider provider = mock(PaymentServiceProvider.class);
		when(provider.processPayment()).thenReturn(true);
		
		assertEquals("Success", order.checkOut(provider));
		
	}
	
	@Test
	void testFailPayment() {
		Order order = new Order();
		PaymentServiceProvider provider = mock(PaymentServiceProvider.class);
		when(provider.processPayment()).thenReturn(false);
		
		assertEquals("Failure", order.checkOut(provider));
		
	}

}

package id.ifundip.mockito;

public class Order {
	
	public Order() {
	}
	
	public String checkOut(PaymentServiceProvider service) {
		return service.processPayment() ? "Success" : "Failure";		
	}	
	
}

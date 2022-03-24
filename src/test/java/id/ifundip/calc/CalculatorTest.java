package id.ifundip.calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
	
	private Calculator calc;
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("Penjumlahan bilangan bulat positif.")
	public void testTambahBilanganBulatPositif() {
		assertEquals(10, calc.tambah(5, 5));
	}

	@Test
	@DisplayName("Penjumlahan bilangan bulat negatif.")
	public void testTambahBilanganBulatNegatif() {
		assertEquals(-10, calc.tambah(-5, -5));
	}

	@Test
	@DisplayName("Pembagian bilangan, hasil bulat.")
	public void testTambahBilanganBulatHasilnya() {
		assertEquals(5, calc.bagi(10, 2));
	}
	
	@Test
	@DisplayName("Pembagian bilangan dengan Nol, menghasilkan arithmetic exception")
	public void testTambahBilanganDenganNol() {
		assertThrows(Exception.class, new Executable() {
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				calc.bagi(10, 0);
			}
		});
	}
	
	@DisplayName("Penjumlahan dengan banyak data")
	@ParameterizedTest(name= "{index} => a={0}, b={1}, sum={2}")
	@CsvSource({"1,2,3","4,5,9"})
	public void testPenjumlahanDenganBanyakData(int a,int b, int sum) {
		calc.tambah(sum, calc.tambah(a,b));
	}
	
	
	
}

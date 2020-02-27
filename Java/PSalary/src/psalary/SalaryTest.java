package psalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	void testGetTax() {
		Salary one = new Salary(71000);
		assertEquals(14350,one.getTax());
	}

	@Test
	void testGetNet() {
		Salary two = new Salary(69000);
		assertEquals(55280,two.getNet());
	}
	
	@Test
	void testGetTaxTwo() {
		Salary three = new Salary(11000);
		assertEquals(1155,three.getTax());
	}
	
	void testGetNetTwo() {
		Salary four = new Salary(48000);
		assertEquals(40580.70,four.getNet());
	}
	
	
}

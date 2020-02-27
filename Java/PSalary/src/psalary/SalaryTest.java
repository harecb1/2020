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
		assertEquals(1155,three.getTax(),0.01);
	}
	
	void testGetNetTwo() {
		Salary four = new Salary(69000);
		assertEquals(40580.70,four.getNet());
	}
	
	@Test
    public void dalesTestSuiteForTax()
    {
	//the instructor's test suite for tax
	Salary money = new Salary(120000.50);
	assertEquals(30520.17, money.getTax(),0.01);
	money.setGross(52112);
	assertEquals(8653.6, money.getTax(),0.01);
	money.setGross(44567);
	assertEquals(6819.23, money.getTax(),0.01);
	money.setGross(7623);
	assertEquals(800.42, money.getTax(),0.01);
	//a couple more tests
	//these would normally be in separate methods
	//test the net
	assertEquals(6822.59, money.getNet(),0.01);
	//test a negative
	money.setGross(-50);
	assertEquals(0, money.getTax(),0.01);
    }

}

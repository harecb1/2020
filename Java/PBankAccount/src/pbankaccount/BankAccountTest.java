package pbankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetBalance() {
		BankAccount acc = new BankAccount();
		assertEquals(0,acc.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(), 50);
	}

	@Test
	void testWithdraw() {
		BankAccount acc = new BankAccount();
		acc.withdraw(50);
		assertEquals(acc.getBalance(), -55);
	}
	
	@Test
	void testWithdraw2() {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		acc.withdraw(150);
		assertEquals(acc.getBalance(), -55);
	}
	
	@Test
	void testInterest() {
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.addInterest();
		assertEquals(acc.getBalance(), 1033.50);
	}
}

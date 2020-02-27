package pbankaccount;

public class BankAccount {
	private double balance;
	public BankAccount() {
		balance = 0;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double i) {
		balance += i;
	}
	public void withdraw(double i) {
		balance -= i;
		if (balance < 0) {
			balance -= 5;
		}
	}
	public void addInterest() {
		double interest = 0;
		double tax = 0;
		if (balance > 0) {
			interest = balance * 0.05;
			tax = interest * 0.33;
			interest -= tax;
			balance += interest;
		}
	}
}

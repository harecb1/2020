package psalary;

public class Salary {
	private double gross;
	public Salary(double gross) {
		getGross();
		setGross(gross);
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getTax() {
		double tax = 0;
		if (gross >= 70000) {
			tax += (gross - 70000) * 0.33;
			tax += (70000 - 48000) * 0.30;
			tax += (48000 - 14000) * 0.175;
			tax += 14000 * 0.105;
		}
		else if ((gross > 48000) && (gross < 70000)) {
			tax += (gross - 48000) * 0.30;
			tax += (48000 - 14000) * 0.175;
			tax += 14000 * 0.105;
		}
		else if ((gross > 14000) && (gross < 48000)) {
			tax += (gross - 14000) * 0.175;
			tax += 14000 * 0.105;
		}
		else if ((gross > 0) && (gross < 14000)) {
			tax += gross * 0.105;
		}
		return tax;
	}
	public double getNet() {
		double net = 0;
		net = gross - getTax();
		return net;
	}
}

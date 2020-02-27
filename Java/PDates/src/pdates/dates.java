package pdates;

import java.time.LocalDate;

public class dates {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getDayOfYear());
		
		
	}

}

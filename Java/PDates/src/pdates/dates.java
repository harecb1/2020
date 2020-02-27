package pdates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getDayOfYear());
		
		LocalDate cullanBDay = LocalDate.of(1999,10,2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		System.out.println(formatter.format(cullanBDay));
		
		
	}

}

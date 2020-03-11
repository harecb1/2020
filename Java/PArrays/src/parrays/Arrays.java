package parrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cullan");
		names.add("Rheyden");
		names.add("Ethan");
		names.add("Jeff");
		names.add("Arlin");
		System.out.println(names);
		names.remove(3);
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("Cullan is at position " + names.indexOf("Cullan"));
		System.out.println("Position 3 is " + names.get(3));
		
		
		ArrayList<Balloon> balloons = new ArrayList<Balloon>();
		for(int i = 0;i < 10;i++) {
			balloons.add(new Balloon());
		}
		for(Balloon balloon:balloons) {
			System.out.println(balloon.writeColour(balloon.getColour()));
		}
	}

}

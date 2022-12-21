package exmaple.collection;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>cities = new HashSet<String>( );
		
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Lucknow");
		cities.add("Nashik");
		cities.add("Jaipur");
		cities.add("Mumbai");	// here set does not accept repeated Strings
		cities.add("Pune");		// same.
		
		for(String city : cities)
			System.out.println(city);
		
	}

}

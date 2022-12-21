package example.collection.generics;

import java.util.ArrayList;

public class TypesafeCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The collection named as 'riverNames' is supposed to accept only String Objects
		//To achieve this, declare the collection as type-safe for String type.
		
		ArrayList<String> riverNames = new ArrayList<>( );
		
		riverNames.add("Ganaga");
		riverNames.add("Yamuna");
		riverNames.add("Godhavari");
		riverNames.add("Krishna");
		riverNames.add("Kayna");
		
		//Trying to add an object other than String but this won't compile.
		//riverNames.add(100); // this is Compilation Error.
		
		for(String riverName : riverNames)
			System.out.println(riverName.toUpperCase());
		
	}

}

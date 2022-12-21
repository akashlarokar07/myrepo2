package exmaple.collection;

import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetExmaples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*SortedSet laptopBrands = new TreeSet( );
		 * the following collection is not type safe can accept any type of object
		 * But throws an exception because it is Sorted Collection.
		 
		
		laptopBrands.add("HP");
		laptopBrands.add("Dell");
		laptopBrands.add("Toshiba");
		laptopBrands.add("Lenevo");
		laptopBrands.add("Apple");
		laptopBrands.add(100);
		
		for(Object brand : laptopBrands)
			System.out.println(brand);
		*/
		SortedSet<String> laptopBrands = new TreeSet<String>( );
		laptopBrands.add("HP");
		laptopBrands.add("Dell");
		laptopBrands.add("Toshiba");
		laptopBrands.add("Lenevo");
		laptopBrands.add("Apple");
		
		for(String brand : laptopBrands)
			System.out.println(brand);
	}

}

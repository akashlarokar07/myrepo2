package exmaple.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithLaptopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating some laptop objects
		
		Laptop laptop1 = new Laptop( );
		Laptop laptop2 = new Laptop("SO2","Lenovo",43000 );
		Laptop laptop3 = new Laptop("SO3","Dell",45000 );
		Laptop laptop4 = new Laptop("SO4","Toshiba",44000 );
		Laptop laptop5 = new Laptop("SO5","Apple",104000 );
		
		//Adding all the Laptop Objects into a TreeSet
		
		SortedSet<Laptop> allLaptops = new TreeSet<Laptop>( );
		
		allLaptops.add(laptop1);
		allLaptops.add(laptop2);
		allLaptops.add(laptop3);
		allLaptops.add(laptop4);
		allLaptops.add(laptop5);
		
		//Displaying all the Laptop 
		for(Laptop laptop : allLaptops)
			System.out.println(allLaptops);
		
		
	}

}

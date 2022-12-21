package exmaple.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList values = new ArrayList( );
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(45.78f);
		
		//Populating a ListIterator on the top of the ArrayList named as 'values' in such way that 
		//the courser point to the bottom.
		
		int size = values.size();
		ListIterator listIt = values.listIterator(size);
		while(listIt.hasPrevious())
		{
			Object value = listIt.previous();
			System.out.println(value);
		}
		
		
	}

}

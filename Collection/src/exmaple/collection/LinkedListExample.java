package exmaple.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList values = new LinkedList( );
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(200);
		
		//Adding the element at the top
		values.addFirst("Welcom");
		

		for(Object val : values)
			System.out.println(val);
		
		//Retrieving the element from the bottom
		
		Object elementAtBottom = values.getLast( );
		System.out.println("Last ele = "+elementAtBottom);
		
	}

}

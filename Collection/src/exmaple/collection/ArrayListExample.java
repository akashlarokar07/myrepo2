package exmaple.collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList values = new ArrayList( );
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(200);
		
		for(Object val : values)
			System.out.println(val);
	}

}

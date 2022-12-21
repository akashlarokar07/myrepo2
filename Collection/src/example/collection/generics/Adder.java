package example.collection.generics;

public interface Adder<T> {//since the exact type is not mentioned this interface is a generic interface.
	
	T doAdd(T t1 , T t2);
	//In case of classes it will behave like
	//for Strings : Strings doAdd(String s1 , String s2)
	//for Integers : Integers doAdd(Integer i1 , Integer i2)

}

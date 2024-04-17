package ArrayList_Concept;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class Iteration_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add(24);
		a1.add("hima");
		a1.add("anis");
		a1.add(null);
		a1.add(9808.809);
		a1.add('a');
		
		
		//1st method to iterate and is avaiable for whole classes and inyerafce present in collection 
		//returntype of iterator() is a Iterator thatwhy stored in Iterator
		
		System.out.println("\n---------------Through Iterator------------------");
		Iterator i=a1.iterator();
		//make use of while loop as its dyamic in nature so its size is not fixed 
		while(i.hasNext()==true)  //as hasNext() retur type is boolean so test with True which means iterator till its equal to equal to true that means it has elements present  
		{
			//hasNext()--Gives the present value n check with that 
			System.out.println(i.next());
			//next(): will give next next value 
			//Returns the next element in the iteration.
		}
		
		
		/*2nd method 
		 * Only used by List(I)
		 * how to Iterate through list iterator in List(I) 
		 */
		
		
		/* Backward will work only if we have done forward */
		System.out.println("\n---------------Through ListIterator in forward direction ------------------");
		ListIterator i1 =a1.listIterator(); //return type ListIterator(I)
		while(i1.hasNext()==true)
			
		{
			System.out.println(i1.next());
		}
		
		
		/*
		 Now as both are iterating what's the different 
		 it is that 
		 through iterator we can iterator in forward direction only 
		 but with ListIterator we can iterate in forward and backward direction  
		 */
		
		System.out.println("\n---------------Through ListIterator in backward  direction ------------------");
	
		while(i1.hasPrevious()==true)
			
		{
			System.out.println(i1.previous());
		}
		
		 
	}

}

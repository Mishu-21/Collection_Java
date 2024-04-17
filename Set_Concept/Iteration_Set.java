package Set_Concept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Iteration_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet t=new HashSet();
		t.add(199);
	//	t.add(80);
	t.add(null);   //java.lang.NullPointerException  as TreeSet doesnot store null 
	t.add(18.9);
	//	t.add("hun");
		t.add('a');
		t.add('H');
	//	t.add(-99);
		
		//returntype of iterator() is a Iterator thatwhy stored in Iterator
				Iterator i=t.iterator();
				//make use of while loop as its dyamic in nature so its size is not fixed 
				while(i.hasNext()==true)  //as hasNext() retur type is boolean so test with True which means iterator till its equal to equal to true that means it has elements present  
				{
					System.out.println(i.next());
				}
	}
				
				/*
				ListIterator i1 =t.listIterator(); 
						when trying to define this in set than below error is shown
						The method listIterator() is undefined for the type HashSet
						which means its only avaliable for List(I)
			
*/
}

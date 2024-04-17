package ArrayList_Concept;

import java.util.ArrayList;
import java.util.Collections;

public class Add_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		/*
		 * add() is trying to accept object parameter which means 
		 * it stores an object in
		 * form of an object 
		 * --->The method add(Object) belongs to the raw type ArrayList.
		 */
		
		
		
		/*
		 * 1.Dynamic nature:Can store as many values as we want 
		 * 2.Heterogeneous in nature:as can st0re any datatype value 
		   3.Non sorted
           4.Can store duplicate value---> and we can sort the values if its homogenous in nature  so we cant sort the value with a1 object 
                                             but with a2 we can as usmai homogenous values h 
           5.Can store null 
           6.Follow indexing---as jo phle add kiya usne 1st position le,2nd add kiya usne 2nd position and so on 
		 */
		a1.add(987);
		a1.add(97);
		a1.add("himanshui");
		a1.add(true);
		a1.add(87880.000);
		a1.add(null);
		a1.add(987);
		a1.add('A');
		System.out.println("Index  " +a1.get(0));
		System.out.println(a1);
	System.out.println("\n----------Reverse order for heterogenous value -------------");
		//System.out.println(Collections.reverseOrder(a1)); not applicable to arraylist reverOrder in this format 
		Collections.reverse(a1);
		System.out.println(a1);
		//System.out.println(a1);	
		//System.out.println(	Collections.reverse(a1));
		ArrayList a2=new ArrayList();
		a2.add(67);
		a2.add(6);
		a2.add(69);
		a2.add(87);
		a2.add(-67);
		a2.add(07);
		
		a2.set(0, 34);
		System.out.println("Set element 34 at specific index 0.so now a2 arrraylist is  " +a2);
		
		//a2. kiya add mai dikh rha hai yeh ArrayList se aa rha h
		System.out.println("\n----------Print homogenous value -------------");
		System.out.println(a2);
		//when we print it it is not automatically sorted but we can sort it forcefully as it has homogenous value 
		
		//and to sort we use collections class
		System.out.println("\n----------sort as its homogeneous -------------");
		Collections.sort(a2);
		System.out.println(a2);
		System.out.println("\n----------Reverse order for homogenous value -------------");
		//if homogenous so can print in this way too
		Collections.sort(a2, Collections.reverseOrder());
		System.out.println(a2);
	
		//System.out.println(a2);System.out.println(a2);
		
	}

}

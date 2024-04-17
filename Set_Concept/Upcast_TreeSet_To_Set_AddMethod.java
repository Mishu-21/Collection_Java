package Set_Concept;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Upcast_TreeSet_To_Set_AddMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To upcaste TreeSet to Set interface or can write TreeSet to Set(I)
				/*
				 * RHS par woh hoga jisko upcast karna hai ie.TreeSet 
				 * LHS par woh hoga jismai karna hai ie Set(I)
				 *
				 *
				 *and we also know upcasting can be done implicitly or explicitly 
				 */
				
		//upcasted to know the behaviour of Set(I)
		Set s1=new TreeSet();     //------>implicit
		//Set s1=(Set)new TreeSet();  
		
		
		/*
		 1.Indexing: does not follow indexing or we can say order of insertion 
		               now question arises how they are stored::So whenever we add a value in a set a hashcode value is generated automatically and based on it they are inserted 
		 2. duplicate:Does not enter duplicate value 
		 3. Null Value :with treeset wont allow any  null value 
		 4. dynamic in  nature
		 
		 
		 */
		
		
		
		//ab .add kiya  toh we see yeh List of method  aa rhe hai  and circle ke  uper 'A' krke likha hai ie abstarct  method of set interfcae

		s1.add(6868);
		s1.add(798989);
		s1.add(268);
		s1.add(9);
	//	System.out.println(s1);
		s1.add(9);
		s1.add(9);
	//	s1.add("Himanshi");
		//s1.add('A');
		System.out.println(s1);
		//Collections.sort(s1);
		
	/* set  allow one null value at most.
	 * but    when we try to add null value  with tree set 
		s1.add(null);
		s1.add(null);  
		give "java.lang.NullPointerException" ass TreeSet  doesnt allow null value 
		*/
		
		
		
	/*
		https://www.tutorialspoint.com/can-we-add-null-elements-to-a-set-in-java#:~:text=As%20per%20the%20definition%20a,it%20displays%20only%20one%20null.
	
	        1. Null values in TreeSet − The TreeSet object does not allows null values but, If you try to add them, a runtime exception will be generated at.
	        2.Null values in LinkedHashSet: Just like the HashSet object, this also allows null values but, you can add only one null element to it. Though you add more null values if you try to print its contents, it displays only one null.
	        3.Null values in HashSet − The HashSet object allows null values but, you can add only one null element to it. Though you add more null values if you try to print its contents, it displays only one null.
	*/
	}
}

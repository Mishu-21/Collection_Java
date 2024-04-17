package ArrayList_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Upcast_ArrayList_To_ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//To upcaste ArrayList to List interface or can write ArrayList to List(I)
		/*
		 * RHS par woh hoga jisko upcast karna hai ie.ArrayList 
		 * LHS par woh hoga jismai karna hai ie List(I)
		 *
		 *
		 *and we also know upcasting can be done implicitly or explicitly 
		 */
		
		
		//upcasted to know the behaviour of List(I)
	//	List l1=new ArrayList();  ----->implicitly 
		List l1=(List)new ArrayList();  //------>Explicitly 
		
		//ab .add kiya  toh we see yeh List se aa rhe hai  and circle ke  uper 'A' krke likha hai ie abstarct  method of list interfcae
		
		l1.add(7979);
		l1.add(79);
		l1.add("7979");
		
		l1.add(null);
		l1.add(729);
		l1.add("Himsh9");
		
	
		l1.add(null);
		l1.add(7900);
		l1.add("79.79");
		
		System.out.println(l1);
		
		/*1.it shows that it follow indexing 
		 * 2. store as many nulls
		 * 3,duplicate value 
		 * 4.heterogenous value 
		   5. dynamic nature 
		   6.  sorted only if it conatins homogenous value
		*/
		
	//	Collections.sort(l1);
		//so as l1 contains heterogenous value so it can't be sorted and if we try to run it it will give
		// java.lang.ClassCastException
		
	}

}

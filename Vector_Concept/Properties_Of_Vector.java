package Vector_Concept;


import java.util.Vector;

public class Properties_Of_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector a1=new Vector();
		
		
		
		/*
		 * 1.Dynamic nature:Can store as many values as we want 
		 * 2.Heterogeneous in nature:as can st0re any datatype value 
		   3.Non sorted
         
          5.Folow order of insertion  
           1.Follow indexing---as jo phle add kiya usne 1st position le,2nd add kiya usne 2nd position and so on 
		 */
		
		a1.add(987);
		a1.add(97);
		a1.add("himanshui");
		a1.add(true);
		a1.add(87880.000);
		a1.add(null);  //3 Can store 'n 'null 
		a1.add(null);
		a1.add(null);
		a1.add(987);  //2.store dupliate 
		a1.add('A');
		
		System.out.println(a1);
	}

}

/*Methods of vector are:
	1.addElements(Object obj):Add the element
	2.firstElement():
	3.LastElement()
	4.removeElement(Object obj)
	5.removeElementAt(int index)
	6.removeAllElements()
	7.capacity()

*/
package Vector_Concept;

import java.util.Enumeration;
import java.util.Vector;

public class Methods_Of_Vector {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		System.out.println("\n------------------addElements(Object obj)------------------");
		v.addElement(78);

		v.add(987);  //add() method will also work to add element in the vector 
		v.addElement(97);
		v.add("himanshui");
		v.add(true);
		v.addElement(87880.000);
		v.addElement(null); 
		v.add(null);
		v.add(null);
		v.addElement(987);  
		v.addElement('A');
		
		v.add("him");  //add() can also be used to add the elements in vector  
		System.out.println(v);
		
		System.out.println("\n------------------firstElement()------------------");
		System.out.println(v.firstElement());
		
		System.out.println("\n-----------------LastElement()-------------------");
		System.out.println(v.lastElement());
		
		System.out.println("\n------------------removeElement(Object obj)------------------");
		System.out.println(v.removeElement(987)); //as we have more than one 987 so it will remove the first one only 
		//and as its return tpe is null so will give true 
		System.out.println(v);
		System.out.println(v.removeElement(00)); //as element not present so wil return false 
		
		System.out.println("\n------------------removeElementAt(int index)------------------");
		v.removeElementAt(7);  // whenever return tpe is void so cant print in ssyout line 
		System.out.println(v);
		
		/*
		 * v.removeElementAt(98); // when try to remove the elemenr from the index where
		 * the value is not preent
		 * System.out.println(v);//java.lang.ArrayIndexOutOfBoundsException: will occur
		 * 
		 */
		System.out.println("\n------------------removeAllElements()------------------");
//	System.out.println(	v.removeAllElements());  The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
		
		v.removeAllElements();
		System.out.println(v);
		
		System.out.println("\n------------------capacity()------------------");
		System.out.println(v.capacity());
		v.add("himanshui");
		v.add(true);
		v.addElement(87880.000);
		v.addElement(null); 
		v.add(null);
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.firstElement());
		
		
		System.out.println("\n------------------Enumeration()------------------");
		//only forward direction 
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		}

}

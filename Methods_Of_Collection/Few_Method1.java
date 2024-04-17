/*We have different methods of collection

as it can be used with all the classes and interface we have in this hierarchy 

   1.add():this can add one object 
   2.addAll(): can add entire collection 
   3.contains():boolean return type
                returns true or false that particular objet prensent in a string or not 
   4.containsAll(): return type boolean 
                   Parameter is collection 
   5.remove():boolean return type
                remove object 
   6.removeAll():boolean return type
                 remove collection 
   7.isEmpty():boolean return type
               ie check whetger given arraylist is empty or not 
   8. clear():Will Make array as empty
              Removes all of the elements from this list. The list willbe empty after this call returns.
   9.size:Returns the number of elements in the list.

*/


package Methods_Of_Collection;

import java.util.ArrayList;

public class Few_Method1 {

	public static void main(String[] args) {
		
		//create an object of arraylist
		ArrayList a2=new ArrayList();
		a2.add(668);
		a2.add("Suraj");
		a2.add("Moon");
		a2.add("Water");
		System.out.println(a2);
		
		System.out.println("\n-----------------contains()--------------------");
		System.out.println(a2.contains("Moon"));
		System.out.println(a2.contains("moon"));
		System.out.println(a2.contains(89));
		
		System.out.println("\n-----------------isEmpty()--------------------");
		System.out.println(a2.isEmpty());
		ArrayList a=new ArrayList();
		System.out.println(a.isEmpty()); //true as nothing is added in it 
		
		System.out.println("\n-----------------clear()--------------------");
		a.add(78);
		a.add('A');
		a.add("Hima");
		a.add(90.788);
		System.out.println(a);		
		
		//when tried to do this way give this error
	//	System.out.println(a.clear());//The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
		//so do this way 
		a.clear();
		System.out.println(a);
		
		System.out.println("\n-----------------remove()--------------------");
		System.out.println(a2.remove("Water"));
		System.out.println(a2);
		
		System.out.println("\n-----------------AddAll()------------------");
		
		//addAll():its paramter is collection
		ArrayList a3=new ArrayList();
		a3.addAll(a2);  //so as a2 is a collection of ArrayList so we can add whole collection 
		
		System.out.println(a3);
		
		a3.addAll(2, a2);  //index and collection yeh h as a parameter 
		
	System.out.println(a3);  //ab new a3 yeh h so yha niche wala add hoga as per the output
	
	a3.addAll(3, a2);
	System.out.println(a3);
	
	//we can add other thimgs also 
	a3.add("hiamhsju");
	a3.add(null);
	System.out.println(a3);
	//yeh kiya toh out of bind exception mila 
	//a3.addAll(89, a2); // java.lang.IndexOutOfBoundsException:
	
	
	
	System.out.println("\n-----------------containsAll()--------------------");
	System.out.println(a2.containsAll(a2));
	
	
	System.out.println("\n-----------------removeAll()--------------------");
	System.out.println(a3);
	System.out.println(a3.removeAll(a2));
	System.out.println(a3);
	
	System.out.println("\n-----------------size()--------------------");
	System.out.println(a3.size());
	}

}

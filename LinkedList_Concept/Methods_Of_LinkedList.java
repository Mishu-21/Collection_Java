package LinkedList_Concept;

import java.util.LinkedList;

public class Methods_Of_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	LinkedList l1=new LinkedList();
		LinkedList<Integer> l1=new LinkedList(); //if write this way it means it will only store int value
		
	//	l1.add("him"); // error as int value will only save 
		
		l1.add(89);
		l1.add(99);
		l1.add(842);
		l1.add(23);
		l1.add(90);
		l1.add(19);
		l1.add(9);
		
		
		System.out.println("\n----------------getFirst() Method---------------------------------------");
		System.out.println(l1.getFirst());
		
		System.out.println("\n----------------getLast() Method---------------------------------------");
		System.out.println(l1.getLast());
		
		System.out.println("\n----------------peekFirst() Method---------------------------------------");
		System.out.println(l1.peekFirst());
		
		System.out.println("\n----------------peekLast() Method---------------------------------------");
		System.out.println(l1.peekLast());
		
		System.out.println("\n----------------addFirst() /addLast()Method---------------------------------------");
		l1.addFirst(1);
		l1.addLast(100);
		System.out.println(l1);
		
		System.out.println("\n----------------peekFirst() Method---------------------------------------");
		System.out.println(l1.peekFirst());
		
		System.out.println("\n----------------peekLast() Method---------------------------------------");
		System.out.println(l1.peekLast());
		System.out.println("\n----------------removeFirst() Method---------------------------------------");
		System.out.println(l1.removeFirst());
		
		System.out.println("\n----------------removeLast() Method---------------------------------------");
		System.out.println(l1.removeLast());
		
		System.out.println(l1);
		
		System.out.println("\n----------------pollFirst() Method---------------------------------------");
		System.out.println(l1.pollFirst());
		
		System.out.println("\n----------------poolLast() Method---------------------------------------");
		System.out.println(l1.pollLast());
		
		System.out.println(l1);
		
		System.out.println("\n----------------add() Method at particular index ie in-between ---------------------------------------");
		l1.add(2, 22);
		System.out.println(l1);
	}

}

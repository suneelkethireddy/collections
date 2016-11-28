package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		populateLinkedList();

	}
	public static void populateLinkedList(){
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Suneel");
		linkedList.add("554");
		linkedList.add(null);
		linkedList.add("Suneel");
		linkedList.set(0, "Kethireddy");
		linkedList.add(0, "Suneel");
		linkedList.addFirst("Royal");
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		
		
		
		
	}

}

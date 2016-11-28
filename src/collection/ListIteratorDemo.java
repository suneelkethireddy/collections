package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		populateLinkedList();
		}
	public static void populateLinkedList(){
		
		List<String> linkedList=new LinkedList<String>();
		linkedList.add("Ballaya");
		linkedList.add("Venky");
		linkedList.add("Chiru");
		linkedList.add("Nag");
		System.out.println(linkedList);
		ListIterator<String> ltr=linkedList.listIterator(); 
		while(ltr.hasNext()){
			String s=(String)ltr.next();
			if(s.equals("Venky"))
				ltr.remove();
			else if(s.equals("Chiru"))
				ltr.set("Ram Charan");
			else if(s.equals("Nag"))
				ltr.set("Akhil");
		}
		System.out.println(linkedList);
		
		
		
	}

}

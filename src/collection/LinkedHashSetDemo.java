package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		populateLinkedHashSet();

	}
	public static void populateLinkedHashSet(){
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		
		h.add("Suneel");
		h.add("Kumar");
		h.add("Kethireddy");
		h.add(null);
		System.out.println(h.add("Suneel"));
		
		System.out.println(h);
		
	}

}

package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		populateHashSet();
	}
	public static void populateHashSet(){
		HashSet<String> h=new HashSet<String>();
		
		h.add(null);
		h.add("Kumar");
		h.add("Kethireddy");
		h.add("Suneel");
		System.out.println(h.add("Suneel"));
		h.add("Suneel");
		System.out.println(h);
	}

}

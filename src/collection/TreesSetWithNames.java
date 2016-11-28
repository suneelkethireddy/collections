package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreesSetWithNames {

	public static void main(String[] args) {
		
		MyComparator1 comaprator = new MyComparator1();
		Set<String> t=new TreeSet<String>(comaprator);
		t.add("Roja");
		t.add("Shoba Rani");
		t.add("Raja Kumari");
		t.add("Ganga Bhavani");
		t.add("Rammulama");
		System.out.println(t);
	}
	
	
}

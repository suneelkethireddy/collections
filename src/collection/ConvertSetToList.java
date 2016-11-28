package collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ConvertSetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> set=new HashSet<String>();
		set.add("Z");
		set.add("B");
		set.add("C");
		set.add("D");
		System.out.println(set);
				
		LinkedList<String> list=new LinkedList<String>(set);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
		
		

	}

}

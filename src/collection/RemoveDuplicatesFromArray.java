package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list=new ArrayList<String>();
		list.add("Suneel");
		list.add("Kumar");
		list.add("Kethireddy");
		list.add("554");
		list.add("Suneel");
		list.add("554");
		System.out.println(list);
		
		RemoveDuplicatesFromArray obj =  new RemoveDuplicatesFromArray();
		List<String> lst = obj.removeDuplicates(list);
		System.out.println(lst);
	}
	
	
	public List<String> removeDuplicates(List<String> list)
	{
		
		
		Set<String> set=new LinkedHashSet<String>(list);
		List<String> nonDuplicatesList = new ArrayList<String>(set);
		
		
		return nonDuplicatesList;
	}
}

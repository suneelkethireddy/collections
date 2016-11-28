package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		populateIterator();

	}
	public static void populateIterator()
	{
		List<Integer> arrayList=new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++){
			arrayList.add(i);			
		}
		System.out.println(arrayList);
		Iterator<Integer> itr=arrayList.iterator();
		while(itr.hasNext()){
		int i=(Integer)itr.next();
		if(i%2 ==0)
			System.out.println(i);
		else 
			itr.remove();
		}
		
		System.out.println(arrayList);
		
	}

}

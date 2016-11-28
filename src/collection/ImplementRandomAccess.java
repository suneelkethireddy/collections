package collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ImplementRandomAccess {

	public static void main(String[] args) {
		if(checking()==true)
		checking();
		}
	
	public static boolean checking(){
		
		List<String> arrayList1=new ArrayList<String>();
		List<String> arrayList2=new LinkedList<String>();
		
		System.out.println(arrayList1 instanceof Serializable);
		System.out.println(arrayList1 instanceof Cloneable);
		System.out.println(arrayList1 instanceof RandomAccess);
		System.out.println(arrayList2 instanceof RandomAccess);
		return true;
	}

}

package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1{

	public static void main(String[] args) {
		
		TreeSet treeSet=new TreeSet(new MyComparator1());
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(15);
		treeSet.add(0);
		System.out.println(treeSet);

	}
}
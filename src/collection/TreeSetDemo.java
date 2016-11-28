package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		populateTreeSet();

	}
	public static void populateTreeSet(){
		TreeSet t=new TreeSet();
		
		t.add('a');
		t.add('B');
		t.add('Z');
		t.add('L');
		t.add('Z');
		System.out.println(t);
	}

}

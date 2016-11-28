package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> op = populateArrayList();
		op.add("12");

	}
	
	public static List<String> populateArrayList()
	{
		List<String> arrayList = new ArrayList<String>();

		arrayList.add("Suneel");
		arrayList.add("554");
		arrayList.add("Kumar");
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.remove(3);
		System.out.println(arrayList);
		arrayList.add(3,"Kethireddy");
		arrayList.add("Success");
		System.out.println(arrayList);
		return arrayList;
	}
}

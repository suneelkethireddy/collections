package collection;

import java.util.Comparator;


public class MyComparator1 implements Comparator{
	
	public int compare(Object obj1,Object obj2){
		String I1=(String)obj1;
		String I2=(String)obj2;
		//return I1.compareTo(I2);
		//return -I1.compareTo(I2);
		return I2.compareTo(I1);
		//return -I2.compareTo(I1);
		//return +1;
		//return -1;
		//return 0;
	}
} 
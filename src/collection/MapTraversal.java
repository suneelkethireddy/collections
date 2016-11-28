package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversal {
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Sudhakar");
		map.put(2, "Sabitha");
		map.put(3, "Sudheer");
		map.put(4, "Namratha");
		map.put(5, "Suneel");
		printMap(map);
	}
	public static void printMap(Map<Integer,String> mp){
		Set<Map.Entry<Integer,String>> set = mp.entrySet();
		
	
		Iterator<Map.Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer,String> pair=itr.next();
			System.out.println(pair.getKey()+"     "+pair.getValue());
		}
	}
}

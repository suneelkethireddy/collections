package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "sudheer");
		map.put(2, "sabitha");
		map.put(3, "suneel");
		map.put(4, "sudhakar");
		
		Iterator it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	public void traverseThroughAMap(Map<Integer,String> map){
		
	}
		
	}
	

package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntegerAndTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1,99511);
		map.put(2,96666);
		map.put(3,50221);
		map.put(4,50396);
		map.put(5,50369);

		traverseThoughMap(map);
	}
	public static void traverseThoughMap(Map mp){
		Iterator itr=mp.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry pair=(Map.Entry)itr.next();
			System.out.println(pair.getKey()+"      "+pair.getValue());

		}
	}

}

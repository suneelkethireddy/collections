package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class RemoveNullFromList {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Suneel");
		l.add("Reddy");
		l.add(null);
		l.add("Kethiredddy");
		l.add(null);
		l.add(" ");
		l.add("Kumar");
		String temp;
		int length=l.size();
		//System.out.println(length);
		//System.out.println(l);
		Iterator itr=l.iterator();
		/*
		for(int i=0;i<length;i++){
			while(l.get(i)!= null){
				temp=l.get(i);
				l.add(temp);
			}
		}*/		for(int i=0;i<length;i++){
			while(itr.hasNext()){
				if(itr.equals(null)){
					itr.remove();
				}
			}
		}
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
package collection;


import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {


		try{
			Map<Character,Integer> map=new HashMap<Character,Integer>();
			String str="Suneel reddy";
			int l=str.length();
			char ch;
			for(int i=0;i<l;i++)
			{
				ch=str.charAt(i);
				if(ch!=' ')
				{
					if(map.containsKey(ch))
					{
						map.put(ch,map.get(ch)+1); //instead of str.charAr(i)----->ch
					}
					else
					{
						map.put(ch, 1);
					}

					
					{
						continue;
					}
				}
			}

				System.out.println(map);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

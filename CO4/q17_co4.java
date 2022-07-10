package oopslab;

import java.util.HashMap;
import java.util.Map;

public class q17_co4 {
	public static void main(String args[]) {
	Map<Integer,String> mp1=new HashMap<Integer,String>();
	mp1.put(1,"farhana");
	mp1.put(2, "dwany");
	mp1.put(3, "akash");
	System.out.println(mp1);
	mp1.remove(1);
	for(Map.Entry<Integer,String> me:mp1.entrySet())
	{
		mp1.entrySet();
	System.out.println(me.getValue());
	System.out.println(me.getKey());
	}
	}
}

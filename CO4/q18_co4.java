package oopslab;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class q18_co4 {
public static void main(String args[])
{
	Map<Integer,String> map=new HashMap();
	map.put(1,"farhana");
	map.put(2,"mohasin");
	System.out.println("hashmap"+map);
	Map<Integer,String> treemap=new TreeMap();
	treemap.putAll(map);
	System.out.println("treemap"+treemap);
	
}
}

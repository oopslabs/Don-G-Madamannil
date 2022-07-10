package oopslab;

import java.util.ArrayList;

public class q10_co4 {
public static void main(String args[])
{
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("hello");
	ar.add("how");
	ar.add("are");
	ar.add("you");
	for(String str:ar)
	{
		System.out.println(str);
	}
	ar.remove("are");
	System.out.println(ar);
	
	
}
}

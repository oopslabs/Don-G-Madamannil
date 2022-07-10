package oopslab;

import java.util.LinkedHashSet;

public class q15_co4 {
public static void main(String args[])
{
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	lh.add(10);
	lh.add(12);
	lh.add(34);
	lh.add(34);
	System.out.println("the linked list is"+lh);
	System.out.println(lh.contains(12));
	System.out.println("size of list"+lh.size());
	lh.remove(12);
	System.out.println(lh);
}
}

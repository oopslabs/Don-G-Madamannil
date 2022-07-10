package oopslab;

import java.util.Deque;
import java.util.LinkedList;

public class q14_co4 {

	public static void main(String args[])
	{
		Deque<Integer> deq=new LinkedList<Integer>();
		deq.add(21);
		deq.add(32);
		deq.addFirst(55);
		deq.addLast(78);
		deq.offerFirst(99);
		deq.offerLast(100);
		System.out.println(deq);
	}
}

package co4;
import java.util.*;
public class priorityqueue1 {
public static void main(String args[])
{
	int n;
	String str;
	PriorityQueue<String> pq=new PriorityQueue<String>();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the no of elements");
	 n=sc.nextInt();
	 System.out.println("enter elements");
	 str=sc.nextLine();
	 for(int i=0;i<n;i++)
	 {
		 str=sc.nextLine();
		 pq.add(str);
	 }
	 System.out.println("peak "+pq.peek());
	 System.out.println("poll "+pq.poll());
	 Iterator i=pq.iterator();
	 System.out.println("the strings are ");
	 while(i.hasNext())
	 {
		 System.out.println(i.next()+" ");
	 }
}
}

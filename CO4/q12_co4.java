package oopslab;

import java.util.ArrayList;
import java.util.Scanner;

class stack1<T>
{
	int size,top=-1;
	ArrayList<T> arr;
	stack1(int size){
		this.size=size;
	arr=new ArrayList<T>(size);
	
	}
	void push(T a)
	{
		if(top+1==size)
		{
			System.out.println("overflow");
		}
		else
		{
			top++;
			arr.add(a);
		}
		
	}
	void pop()
	{
		System.out.println("removed element is"+arr.get(top));
		top--;
	}
	void top()
	{
		System.out.println(arr.get(top));
	}
	void display()
	{
		for(T ob:arr)
		{
			System.out.println(ob);
		}
	}
	void removestack(T rm)
	{
		arr.remove(rm);
	}
}

public class q12_co4 {
	public static void main(String args[])
	{
		int size,el;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		size=sc.nextInt();
		stack1<Integer> s=new stack1<Integer>(size);
		s.push(10);
		s.push(12);
		s.push(13);
		s.top();
		s.pop();
		s.display();
		System.out.println(" element to be removed");
		el=sc.nextInt();
		s.removestack(el);
		s.display();
	}

}
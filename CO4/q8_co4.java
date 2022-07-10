package oopslab;

import java.util.ArrayList;
import java.util.Scanner;

class stack<T>
{
	int size,top;
	ArrayList<T> arr;
	stack(int size){
	arr=new ArrayList<T>(size);
	top=-1;
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
}

public class q8_co4 {
	public static void main(String args[])
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		size=sc.nextInt();
		stack<Integer> s=new stack<Integer>(size);
		s.push(10);
		s.push(12);
		s.push(13);
		s.top();
		s.pop();
		s.display();
		
	}

}

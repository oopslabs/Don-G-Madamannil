package co3lab;

import java.util.Scanner;

class shape
{
	int l,b,s,r;
	void area(int l,int b)
	{
		this.l=l;
		this.b=b;
		
		System.out.println("Area of rectangle is "+l*b);
		
	}
	int area(int s)
	{
		this.s=s;
		
		return s*s;
	}
	void area(int r,double pi)
	{
		this.r=r;
		System.out.println("area of square is "+pi*r*r);
	}
}
public class q1_co3 {
	public static void main(String args[]){
		
		int l,b,si,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		l=sc.nextInt();
		System.out.println("enter breadth");
		b=sc.nextInt();
		System.out.println("enter side");
		si=sc.nextInt();
		System.out.println("enter radius");
		r=sc.nextInt();
		shape s=new shape();
		s.area(l,b);
		System.out.println("area of circle is "+s.area(si));
		s.area(r,3.14);
		
		
	}

}

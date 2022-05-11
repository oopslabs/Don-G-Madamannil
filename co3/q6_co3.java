package co3oops;

import java.util.Scanner;

interface prototype
{
	double pi=3.14;
	void area();
	void perimeter();
}
class circle implements prototype
{
	Float r;
	double area,per;
	circle()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		r=sc.nextFloat();
	}
	public void area()
	{
		area=pi*r*r;
		System.out.println("area is "+area);
	}
	public void perimeter()
	{
		per=2*pi*r;
		System.out.println("perimeter is "+per);
		
	}
	
}
class rectangle implements prototype
{
	float l,b;
	double area,per;
	rectangle()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		l=sc.nextFloat();
		System.out.println("enter breadth");
		b=sc.nextFloat();
	}
	public void area()
	{
		area=l*b;
		System.out.println("area is "+area);
	}
	public void perimeter()
	{
		per=2*(l+b);
		System.out.println("perimeter is "+per);
		
	}
}
public class q6_co3 {

	public static void main(String args[])
	{
		prototype p;
		System.out.println("Rectangle");
		rectangle r=new rectangle();
		p=r;
		p.area();
		p.perimeter();
		System.out.println("Circle");
		circle c=new circle();
		p=c;
		p.area();
		p.perimeter();
	}
}

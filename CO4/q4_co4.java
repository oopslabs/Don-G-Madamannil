package exception;

import java.util.Scanner;

class negative_exec extends Exception
{
	negative_exec(String msg)
	{
		super(msg);
	}
}
public class q4_co4 {
public static void main(String args[])
{
	float a[];
	float avg=0.0f,sum=0.0f;
	int  n,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements");
	n=sc.nextInt();
	a=new float[n];
	System.out.println("enter the numbers");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextFloat();
		try {
			if(a[i]<0)
			{
				throw new negative_exec("negative no");
			}
			else
			{
				sum=sum+a[i];
				count=count+1;
			}
		}catch(negative_exec e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	System.out.println("total positive number sum is "+sum/count);
}
}
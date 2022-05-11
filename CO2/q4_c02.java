package controlsttmnt;
import java.io.*;
import java.util.*;

class employee{
	int eno;
	String ename;
	float esalary;
	void inputdata() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		ename=br.readLine();
		System.out.println("Enter your eno");
		eno=sc.nextInt();
		System.out.println("Enter your salary");
		esalary=sc.nextFloat();
	}
	void display()
	{
		System.out.println("name: "+ename);
		System.out.println("eno: "+eno);
		System.out.println("salary: "+esalary);
	}
	void searchemp(int en)
	{
		
	}
	
}

public class q4_c02 {
public static void main(String args[]) throws IOException
{
	employee e1[]=new employee[10];
	System.out.println("enter the number of employees");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		e1[i]=new employee();
		e1[i].inputdata();
	}
	for(int i=0;i<n;i++)
	{
		e1[i].display();
	}
	
	System.out.println("enter the eno of employee to be searched");
		en=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(e1[i].eno==en)
			{	
				flag=1;
				System.out.println("employee found");
			}
				
		}
		if(flag==0)
		{
			System.out.println("employee not found");
		}
		
	
}
}

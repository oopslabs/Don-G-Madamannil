package co3lab;
import java.util.Scanner;

class employee{
	String empid,address,name;
	float salary;
	employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		empid=sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter address");
		address=sc.nextLine();
		System.out.println("Enter salary");
		salary=sc.nextInt();
	}
}
class teacher extends employee{
	String department,subject;
	teacher()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department");
		department=sc.nextLine();
		System.out.println("Enter subject");
		subject=sc.nextLine();
	}
	void display()
	{
		System.out.println("Employee id "+empid);
		System.out.println("Employee name "+name);
		System.out.println("Employee address "+address);
		System.out.println("Employee salary "+salary);
		System.out.println("department "+department);
		System.out.println("subject "+subject);
		
	}
}
public class q2_co3 {

	public static void main(String args[])
	{
		int n;
		teacher t1[]=new teacher[10];
		System.out.println("Enter the number of teachers");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		 t1[i]=new teacher();
			
		}
		for(int i=0;i<n;i++)
		{
		 t1[i].display();
			
		}
		
	}

}



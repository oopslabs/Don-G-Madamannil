import java.util.Scanner;

class authenticate_exec extends Exception
{
	authenticate_exec(String msg)
	{
		super(msg);
	}
}
public class q3_co4 {
public static void main(String args[])
{
	String name,pass;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	name=sc.nextLine();
	System.out.println("enter password");
	pass=sc.nextLine();
	
		try {
			if(name.matches("farhana") || name.matches("1234"))
			{
				System.out.println("login successful");
				
			}
			else
			{
				throw new authenticate_exec("invalid username or password");	
			}

			}catch(authenticate_exec e)
		{
			System.out.println(e.getMessage());
		}

}
}


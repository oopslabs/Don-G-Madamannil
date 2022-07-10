import java.util.*;
class multiply extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+"5"+"="+i*5);
        }
    }
}
class prime extends Thread
{
    public void run()
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {   
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }   

            }
            if(count==0)
            {
                System.out.println(i);
            }
            count=0;
            
        }
    }
}
public class q5_co4{
    public static void main(String args[])
    {
        multiply m=new multiply();
        prime p=new prime();
        m.start();
        p.start();
    }
}
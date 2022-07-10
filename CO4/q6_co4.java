import java.util.*;
class fibonacci implements Runnable
{
    public void run()
    {
        int a=0,b=1,n,c,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(i<n)
        {   
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
            
        }

    }
}
class even implements Runnable
{
    public void run()
    {
        int n;
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the limit");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class q6_co4{
    public static void main(String args[])
    {

        fibonacci m=new fibonacci();
        Thread obj1=new Thread(m);
        even p=new even();
        Thread obj2=new Thread(p);
        obj1.start();
        obj2.start();
    }
}
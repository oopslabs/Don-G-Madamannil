class T1 extends Thread
{
	public synchronized void  run()
	{ 
		while(true){
	    double r=Math.floor(Math.random()*100);
	    System.out.print("number is:");
		System.out.println(r);
		if(r%2==0)
		{
			T2 K =new T2(r);
			K.start();
		}
		else
		{
			T3 Z =new T3(r);
			Z.start();
		}
		T1 k=new T1();
		try {
			k.sleep(600);
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		}
		
	}
	
}
class T2 extends Thread
{
	double k;
	T2(double z){
		k=z;
	}
	public synchronized void run()
	{
		System.out.println(k*k);
		
		
	}
	
}
class T3 extends Thread
{
	double k;
	T3(double z){
		k=z;
	}
	public synchronized void run()
	{
		System.out.println(k*k*k);
		
		
	}
	
}
public class ThreadC {
public static void main(String args[])
{
	T1 obj=new T1();
	obj.start();
}
}

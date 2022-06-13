import java.util.ArrayList;
import java.util.Scanner;
class Stack<T>{
	ArrayList<T> st;
	int n,top=-1;
	Stack(int i){
		this.n=i;
		this.st= new ArrayList<T>(i);
	}
	void push(T kl){
				if(top>=n-1){
			System.out.println("Stack FUll");
		}
		else
		{
			//if(top==-1){
				top++;
				st.add(kl);
				//System.out.println("Hello");
				//}
			//else
			//{
			//	st.set(top,kl);
			//}
				//System.out.println("top is"+top);
		}
		
	}
	void pop(){
		if(top<=-1)
		{
			System.out.println("Empty");
			
		}
		else
		{
			top--;
		}
	}
	void topr(){
		if(top<=-1)
		{
			System.out.println("Empty");
			
		}
		else
		{
			System.out.println("Top element is"+st.get(top));
		}
	}
	void display(){
		if(top<=-1)
		{
			System.out.println("Stack is empty");
			
		}
		else
		{
		System.out.println("Elements are:");
		for(int i=top;i>=0;i--)
		{
			System.out.println(st.get(i));
		}
	}}
}
public class Stackpgm {
	public static void main(String args[])
	{ int ch=1;
	
	Scanner sc=new Scanner(System.in);
		Stack<Integer> k=new Stack<Integer>(5);
		do{
			System.out.println("Enter the opertion do u want to do");
			System.out.println("1.Push\n2.POP\n3.Display\n4.Top\n5.Exit");
			int w=sc.nextInt();
			switch(w){
			case 1:System.out.println("Enter element to insert");
				k.push(sc.nextInt());break;
		    case 2:k.pop();break;
		    case 3:k.display();break;
		    case 4:k.topr();break;
		    case 5:ch=0;break;
		    default:System.out.println("Enter valid i/p");
			
			
			}
		
	}while(ch==1);

}}

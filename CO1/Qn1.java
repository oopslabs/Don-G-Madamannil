/*Define a class "product" with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price. */
package CO1;
import java.util.*;
public class Qn1 {
public static void main(String args[])
{
	Product a=new Product();
	Product b=new Product();
	Product c=new Product();
	Product z=a.price<b.price?(a.price<c.price?a:c):(b.price<c.price?b:c);
	System.out.println("\n\n\nlargest priced product Details\nProduct Code:"+z.pcode+"\nProduct Name"+z.pname+"\nPrice:"+z.price);
}
}
class Product{
	int pcode;
	String pname;
	int price;
	Product(){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter product Code:");
		pcode=obj.nextInt();
		obj.nextLine();
		System.out.print("Enter product Name:");
		pname=obj.nextLine();
		System.out.print("Enter product Price:");
		price=obj.nextInt();
	}
	
}

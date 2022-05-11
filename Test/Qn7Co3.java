import java.util.*;
public class Qn7Co3{
    public static void main(String args[])
    {
    
    Scannner obj=new Scanner(System.in);
    System.out.println("Enter Number of items:");
    int n=obj.nextInt();
        CalStore a[]=new CalStore[n];
    for(int i=0;i<n;i++)
    {
a[i]=new CalStore();
    }
     System.out.println("Enter 1 to print Bill:");
    int k=obj.nextInt();
     if(k==1){
         System.out.println("********Bill**************");
           System.out.print("Item code\tItem Name\tQuantity\tUnit Price\tBill");
           
       for(int i=0;i<n;i++){
       
      
       }
     }
    }
}
interface PBill{
    
    float calcu(int up,int qty);
} 
class CalStore implements PBill{
String Pid,Name;
int Quanti,uprice;
CalStore(){
    Scannner obj=new Scanner(System.in);
System.out.println("Enter item code:");
Pid=obj.nextLine();
System.out.println("Enter item Name:");
Name=obj.nextLine();
System.out.println("Enter Quantity:");
Quanti=obj.nextInt();
System.out.println("Enter Unit price:");
uprice=obj.nextInt();
}
float calcu()
{
return Quanti*uprice;
}
}
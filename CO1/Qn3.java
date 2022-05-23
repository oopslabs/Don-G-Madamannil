import java.util.*;

public class Qn3 {
    public static void main(String args[]) {
ComplexNo A1=new ComplexNo();
ComplexNo A2=new ComplexNo();
System.out.println("Sum is:"+(A1.real+A2.real)+"+"+(A1.imagi+A2.imagi)+"i");
    }
}

class ComplexNo {
    int real, imagi;
    static int count;

    ComplexNo(){
    System.out.println("Enter Complex number-"+(++count));
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter Real Part");
    real=obj.nextInt();
    System.out.print("Enter Imaginary Part");
    imagi=obj.nextInt();
    System.out.println("Enterd complex Number:"+real+"+"+imagi+"i");
    System.out.println("**********************************************");

    }
}

import java.util.*;

public class Qn4 {
    public static void main(String args[]) {
        System.out.println("Enter Row and Column size of matrix(Squre matrix)");
        Scanner obj = new Scanner(System.in);
        Symetric A = new Symetric(obj.nextInt());
        if (A.Check() == true)
            System.out.println("Its a sysmetric matrix:");
        else
            System.out.println("Its not a symetric matrix:");

    }
}

class Symetric {
    int A[][] = new int[50][50];
    int k;

    Symetric(int n){
        Scanner obj=new Scanner(System.in);
        k=n;
        System.out.println("Enter"+n+"X"+n+"Elements:");
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++)
             A[i][j]=obj.nextInt();
                            }
                    }

    boolean Check() {
        for (int i = 0; i < k; i++)
            for (int j = 0; j < k; j++)
                if (A[i][j] != A[j][i])
                    return false;
        return true;
    }

}

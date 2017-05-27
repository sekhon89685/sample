
import java.util.Scanner;

public class binary_Strings {
   public static  int[] A=new int[3];
public static void  Binary(int n)
{  if(n<0)
{
    System.out.println(A);
}
else
{
    A[n-1]=0;
    Binary(n-1);
    A[n-1]=1;
    Binary(n-1);
}
    
}  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of bits ");
        int n=sc.nextInt();
 Binary(n);  
}
    
}

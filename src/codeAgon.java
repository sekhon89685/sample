
import java.util.Scanner;

public class codeAgon {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int n=sc.nextInt();
   //int arrx[]=new int[n];
   //int arry[]=new int[n];
   long sumx=x;
   long sumy=y;
   for(long i=0;i<n;i++)
   {
       long d,p;
  d= sc.nextLong(); 
  d=-d;
     sumx+= d;  
   p= sc.nextInt();
   p=-p;
   sumy+=p;
 
   }
        System.out.println(sumx+" "+sumy);
   
}
}

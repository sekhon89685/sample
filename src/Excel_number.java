
import java.util.Scanner;

public class Excel_number {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String s="";
   while(n>0)
   {
      // System.out.println("Hjds");
      int r=n%26;
       s+=(char)(r+64);
       n=n/26;
      // System.out.println(n);
   }
   StringBuffer sb=new StringBuffer(s);
   sb.reverse();
    System.out.println(sb);
}
    
}

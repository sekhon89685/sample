
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int T=sc.nextInt();
   while(true){
       if(T==0)
           break;
       long L=sc.nextLong();
       long R=sc.nextLong();
       long K=sc.nextLong();
       long c=0;
      if(K==0)
           System.out.println(R-L+1);
      else{
       
       for(long i=L;i<=R;i++)
       {
            int count=0;
         String s=Long.toString(i);
      
         for(int j=1;j<=9;j++)
         {
             String ch=Integer.toString(j);
                  

             if((s.contains(ch))&&(i%j==0))
             {
                 count++;
                 if(count>=K)
                 {  c++;
                    // System.out.println(i);
                 break;
                 }
             }
         }
       }
       System.out.println(c);
      }
       T--;    
   }
}
}

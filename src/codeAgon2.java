
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class codeAgon2 {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int c=sc.nextInt();
   Integer arr[][]=new Integer[c][2];
   for(int i=0;i<c;i++)
   {
       arr[i][0]=sc.nextInt();
       arr[i][1]=sc.nextInt();
   }
    Arrays.sort(arr, new Comparator<Integer[]>()
    {
        @Override
        public int compare(Integer[] int1, Integer[] int2)
        {
            Integer numOfKeys1 = int1[1];
            Integer numOfKeys2 = int2[1];
            return numOfKeys1.compareTo(numOfKeys2);
        }
    });
    long sum=0;
    int num=0;
    for(int i=c-1;i>=0;i--)
    {
        if(arr[i][0]<=n){
       sum+=(arr[i][0]*arr[i][1]) ;
       n-=arr[i][0];
        }
        else{
           sum+=arr[i][1]*n; 
           n=0;
           break;

        }
      // num=n-arr[i][0];
       // System.out.println(sum);
      // num+=arr[i][0];
       
    }
        System.out.println(sum);   

   
}
}


import java.util.Arrays;
import java.util.Comparator;

public class Sort{
    public static void main(String[] args) {
   ssort();
}
public static void ssort()
{   
    Integer[][] theArray = {{0,10},{1,9},{2,9},{3,9},{4,15},{5,10},{6,4},{7,8},{8,11},{9,12}};;

    dump(theArray);
    Arrays.sort(theArray, new Comparator<Integer[]>()
    {
        @Override
        public int compare(Integer[] int1, Integer[] int2)
        {
            Integer numOfKeys1 = int1[1];
            Integer numOfKeys2 = int2[1];
            return numOfKeys1.compareTo(numOfKeys2);
        }
    });

    System.out.println("====");
    dump(theArray);     
}

public static  void dump(Integer[][] array)
{
    for(int p = 0, q = 10; p < q; p++)
    {
        System.out.println(array[p][0] + " " + array[p][1]);
    }
}}
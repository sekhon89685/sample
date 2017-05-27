
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class towerOfHanoi {

    public static void TOH(int n, String fp, String tp, String ap) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fp + " to " + tp);
            return;
        }
        TOH(n - 1, fp, ap, tp);
        System.out.println("Move disk " + n + " from " + fp + " to " + tp);
        TOH(n - 1, ap, tp, fp);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the number of disks on a peg");
        int n = sc.nextInt();
        System.out.println("Enter the from_peg,To_peg,auxi_peg");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        TOH(n, a, b, c);

    }

}

package pdf3;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1,s=0;
        while (i<=num) {
            s=s+i;
            i++;
        }
        System.out.println(s);
        
    }
}
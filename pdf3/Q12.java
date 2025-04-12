/*12. Find factorial of a number using for loop */
package pdf3;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f=1;
        for(int i=1;i<=num;i++)
        f=f*i;
        System.out.println(f);
    }
}

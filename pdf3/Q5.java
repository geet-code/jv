/*5. Print numbers from 1 to N using a for loop
 Input: N
 Output: 1 2 3 ... N */
package pdf3;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        System.out.println(i);
    }
}

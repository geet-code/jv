/*7. Print multiplication table of a number using loop
 Input: 5
 Output: 5 10 15 20 ... 50 */
package pdf3;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<11;i++)
        System.out.print(num*i+" ");
    }
}

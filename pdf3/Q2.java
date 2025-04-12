/*2. Check Positive, Negative or Zero
 Input: Any integer
 Output: "Positive", "Negative" or "Zero"
 */
package pdf3;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0)
        System.out.println("Negative");
        if(num==0)
        System.out.println("Zero");
        if(num>0)
        System.out.println("Positive");
    }
}

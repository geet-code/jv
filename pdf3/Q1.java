/*1. Check Even or Odd using if-else
 Input: Any integer
 Output: "Even" or "Odd"
 */
package pdf3;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0)
        System.out.println("Even");
        else 
        System.out.println("Odd");
        sc.close();
    }
}
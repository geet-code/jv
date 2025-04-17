/* Q1. Sum of All Elements
 Ek array lo user se input me, aur uske sare elements ka sum nikaalo. */
package pdf4;
import java.util.Scanner;
public class Q1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       int sum = 0;
       System.out.println("Enter elements:");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
           sum += arr[i];
       }
       System.out.println("Sum = " + sum);
   }
}
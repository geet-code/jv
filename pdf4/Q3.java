/*Q3. Count Even and Odd Numbers
 Array ke andar kitne even aur odd numbers hain, uska count nikaalo. */
package pdf4;

import java.util.Scanner;
public class Q3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       int even = 0, odd = 0;
       System.out.println("Enter elements:");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
           if (arr[i] % 2 == 0)
               even++;
           else
               odd++;
       }
       System.out.println("Even: " + even + ", Odd: " + odd);
   }
}

/*10. Check whether a number is a multiple of 3 or not using if-else */
package pdf3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = num%3;
        switch (m) {
            case 0:
                System.out.println("Multiple");
                break;
        
            default:
            System.out.println("Not Multiple");
                break;
        }
    }
}

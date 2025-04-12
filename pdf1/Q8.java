/*8. Input a character and print its ASCII value */
package pdf1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        System.out.println((int)c);
    }
}

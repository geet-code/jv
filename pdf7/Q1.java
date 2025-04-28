/*1. Factorial of a number
 Input: Take a number 'n'.
 Output: Print the factorial of 'n'.
 Example: n = 5, Output: 120 */
package pdf7;
public class Q1 {

    public static void main(String[] args) {
        int n=5,f=1;
        for (int i = n; i >0; i--) {
            f=f*i;
        }
        System.out.println(f);
    }
}
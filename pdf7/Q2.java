/* 2. Print all factorials from 1 to n
 Input: A number 'n'
 Output: Print factorials from 1 to 'n'
 Example:
 1! = 1
 2! = 2
 3! = 6
 4! = 24 */
package pdf7;

public class Q2 {
    public static void main(String[] args) {
        int n=4;
        for (int j = 1; j <=n; j++) {
            int f=1;
            for (int i = j; i >0; i--) {
                f=f*i;
            }
            System.out.println(f);
        }
        
    }
}

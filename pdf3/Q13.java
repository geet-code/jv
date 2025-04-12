/*13. Write a program to reverse a number using while loop
 Input: 1234
 Output: 4321 */
package pdf3;
public class Q13 {
    public static void main(String[] args) {
        int num = 1234;
        while(num>0){
            System.out.print(num%10);
            num=num/10;
        }
    }
}

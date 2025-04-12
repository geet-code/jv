/*7. Swap two numbers without using third variable
 */
package pdf1;
public class Q7 {
    public static void main(String[] args) {
        int a = 3 , b = 5 ;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
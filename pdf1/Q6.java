/*6. Swap two numbers using a temporary variable
 */
package pdf1;
public class Q6 {
    public static void main(String[] args) {
        int a = 1, b = 2, c;
        System.out.println(a+' '+b);
        c = a; a = b; b = c;
        System.out.println(a+' '+b);
    }
}

/*4. Swap two numbers without using a third variable */
package pdf2;

public class Q4 {
    public static void main(String[] args) {
        int a = 5, b = 10;
a = a + b;
b = a - b;
a = a - b;
System.out.println("a = " + a + ", b = " + b);
    }
}

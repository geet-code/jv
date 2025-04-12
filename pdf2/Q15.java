/*15. Check whether a character is uppercase or lowercase */
package pdf2;

public class Q15 {
    public static void main(String[] args) {
        char ch = 'A';
if (ch >= 'A' && ch <= 'Z')
 System.out.println("Uppercase");
else if (ch >= 'a' && ch <= 'z')
 System.out.println("Lowercase");
else
 System.out.println("Not an alphabet");
    }
}

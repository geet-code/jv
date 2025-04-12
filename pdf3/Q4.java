/*4. Check whether a character is vowel or consonant using switch-case */
package pdf3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
            switch (ch) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    System.out.println("Vowel");
                    break;
                    
                default:
                System.out.println("Consonant");
                    break;
            }
        }
        else
        System.out.println("Not Alphabet");
    }
}

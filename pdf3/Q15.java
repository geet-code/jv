package pdf3;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out.println(a*b);
                break;
                case '/':
                System.out.println(a/b);
                break;
            default:
            System.out.println("Invalid");
                break;
        }
    }
}

package pdf3;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a<b)
        System.out.println("b is greater");
        else
        System.out.println("a is greater");
        sc.close();
    }
}

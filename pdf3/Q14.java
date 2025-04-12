/*14. Check whether a number is prime or not using loop and if-else */
package pdf3;
public class Q14 {
    public static void main(String[] args) {
        int n=11;
        boolean p = false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                p = true;
        }
        if (p) 
            System.out.println("Not Prime");
        else
            System.out.println("prime");
    }
}

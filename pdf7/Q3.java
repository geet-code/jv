package pdf7;

public class Q3 {
    public static void main(String[] args) {
        int n=145,o=n,s=0;
        for (; n > 0; n=n/10) {
            int d=n%10,f=1;
            for (int j = 1; j <= d; j++) {
                f=f*j;
            }
            s=s+f;
        }
        if(o==s)
            System.out.println("sn");
        else
            System.out.println("nsn");
    }
}

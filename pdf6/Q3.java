/*3. Row-wise Sum (Har row ka sum print karo) */
package pdf6;

public class Q3 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
           };
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
            rowSum += arr[i][j];
            }
            System.out.println("Sum of Row " + i + ": " + rowSum);
           }
    }
}

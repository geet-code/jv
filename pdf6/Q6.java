/*6. Minimum Element (Matrix ka sabse chhota element find karo) */
package pdf6;

public class Q6 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
           };
        int min = arr[0][0];
for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < arr[i].length; j++) {
 if (arr[i][j] < min) {
 min = arr[i][j];
 }
 }
}
System.out.println("Minimum element: " + min);
    }
}

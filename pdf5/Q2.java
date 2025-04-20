/* Q2: Compare Two Arrays */
package pdf5;

public class Q2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isEqual = java.util.Arrays.equals(arr1, arr2);
        if (isEqual) {
           System.out.println("Arrays are equal");
        } else {
           System.out.println("Arrays are not equal");
        }
    }
}

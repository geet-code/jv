/* Q4: Common Elements in Two Arrays */
package pdf5;

public class Q4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
 int[] arr2 = {3, 4, 5, 6};
System.out.print("Common elements: ");
 for (int i = 0; i < arr1.length; i++) {
    for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
            System.out.print(arr1[i] + " ");
            break;
        }
    }
 }
    }
}

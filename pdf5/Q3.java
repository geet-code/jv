/* Q3: Merge Two Arrays */
package pdf5;

public class Q3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
 int[] arr2 = {3, 4};
 int[] merged = new int[arr1.length + arr2.length];
 for (int i = 0; i < arr1.length; i++) {
    merged[i] = arr1[i];
 }
 for (int i = 0; i < arr2.length; i++) {
    merged[arr1.length + i] = arr2[i];
 }
 System.out.print("Merged array: ");
//  for (int val : merged) {
//     System.out.print(val + " ");
//  }
 for (int i = 0; i < merged.length; i++) {
   System.out.print(merged[i] + " ");
 }
    }
}

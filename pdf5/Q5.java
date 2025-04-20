/* Q5: Unique Elements from Both Arrays */
package pdf5;

public class Q5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
 int[] arr2 = {3, 4, 5};
 System.out.print("Unique elements: ");
 // arr1 elements not in arr2
 for (int i = 0; i < arr1.length; i++) {
    boolean found = false;
    for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.print(arr1[i] + " ");
    }
 }
 // arr2 elements not in arr1
 for (int i = 0; i < arr2.length; i++) {
    boolean found = false;
    for (int j = 0; j < arr1.length; j++) {
        if (arr2[i] == arr1[j]) {
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.print(arr2[i] + " ");
    }
 }
    }
    
}

//  7. Swap two numbers without using third variable

public class Q7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swap using arithmetic operations
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5 (original value of a)
        a = a - b; // a becomes 10 (original value of b)
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // Swap using bitwise XOR
        a = 5;
        b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; // a now becomes 15 (binary XOR)
        b = a ^ b; // b becomes 5 (original value of a)
        a = a ^ b; // a becomes 10 (original value of b)
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // Swap using multiplication and division (only if both numbers are non-zero)
        a = 5;
        b = 10;
        
        a = a * b; // a now becomes 50
        b = a / b; // b becomes 5 (original value of a)
        a = a / b; // a becomes 10 (original value of b)
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // Note: The multiplication and division method is not safe for zero values.
        // If either a or b is zero, this method will not work correctly.




        // Swap using a temporary variable (for reference)
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using temp variable: a = " + a + ", b = " + b);

        // Note: The above method is the most straightforward and safe way to swap two numbers.
        // The other methods are just for demonstration purposes and may not be suitable for all cases.
        // In practice, the temporary variable method is preferred for its clarity and safety.
        // In Java, you can also use a method to swap two numbers if you want to encapsulate the logic.
        // Here's an example of a method that swaps two numbers using a temporary variable:
        // public static void swap(int a, int b) {

        //     int temp = a;
        //     a = b;
        //     b = temp;
        //     System.out.println("Inside swap method: a = " + a + ", b = " + b);
        // }
        // You can call this method from the main method like this:
        // swap(a, b);

}
}

import java.util.*;
public class Div {
    // A function that returns the GCD of two numbers
    public static int Divisor(int n, int x) {
        // Loop until one of the numbers becomes zero
        while (n != 0 && x != 0) {
            // Replace the larger number with its remainder when divided by the smaller number
            if (n > x) {
                n = n % x;
            } else {
                x = x % n;
            }
        }
        // Return the non-zero number as the GCD
        return n + x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n = sc.nextInt();
        System.out.println("Enter number 2");
        int x = sc.nextInt();
        int result;
        result = Divisor(n, x);
        System.out.println("The Greatest Common Divisor is " + result);
    }
}

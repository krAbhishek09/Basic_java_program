import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();  // Input: Position in Fibonacci series
        
        if (n == 1) {
            System.out.println(0);  // Special case: First Fibonacci number
            return;
        } else if (n == 2) {
            System.out.println(1);  // Special case: Second Fibonacci number
            return;
        }

        int a = 0;  // First Fibonacci number
        int b = 1;  // Second Fibonacci number
        int count = 2;  // Starting from the 3rd Fibonacci number

        while (count < n) {  // Loop until the nth Fibonacci number is reached
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);  // Output the nth Fibonacci number
    }
}

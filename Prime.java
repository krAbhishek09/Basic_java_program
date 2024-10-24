// import java.util.Scanner;

// public class Prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         sc.close();  // Close the scanner to prevent resource leaks

//         if (n < 2) {
//             System.out.println(n + " is not a prime number.");
//             return;
//         }

//         boolean isPrime = true;

//         // Check divisibility using a for loop
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         // Print result
//         if (isPrime) {
//             System.out.println(n + " is a prime number.");
//         } else {
//             System.out.println(n + " is not a prime number.");
//         }
//     }
// }


/**
 * Prime
 */
// public class Prime {
//     public static void main(String[] args) {
        
//         int n=10;
//         int c=2;
//         while (c<n) {
//             if (n%2==0) {
//                 System.out.println("not prime");
//                 c=c+1;
                
//             }
//             else{
//                 System.out.println("prime no");
//             }
            
//         }
//     }

    

// }
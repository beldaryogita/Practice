

// class DigitFromNumber{
//     public static void main(String[] args) {
//         int n=400;
//         String s=String.valueOf(n);
//         // int y=s.length();
//         // char c='';
//         for(int i=0;i<s.length();i++){
//             System.out.println(s.charAt(i));
//         }
        
       
        
//     }
// }

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        printDigits(number);
        
        scanner.close();
    }

    public static void printDigits(int number) {
        if (number == 0) {
            System.out.println(0);
            return;
        }

        if (number < 0) {
            number = -number;  // make the number positive
        }

        // Find the divisor to extract the digits
        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        // Print digits
        while (divisor > 0) {
            int digit = number / divisor;
            System.out.println(digit);
            number %= divisor;
            divisor /= 10;
        }
    }
}

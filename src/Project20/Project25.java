import java.util.Scanner;

public class Project25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // If else statement
        if (divisor == 0) {
            System.out.println("Error: Division by zero is undefined.");
        } else {
            int tempDividend = dividend;
            int quotient = 0;

            // while looping
            while (tempDividend >= divisor) {
                tempDividend -= divisor; // Subtract divisor from the current dividend
                quotient++;              // Increment quotient by 1 for each successful subtraction
            }

            int remainder = tempDividend; // Whatever is left over is the remainder

            // Output
            System.out.println("\n--- Result ---");
            System.out.printf("%d / %d = %d%n", dividend, divisor, quotient);
            System.out.printf("Remainder: %d%n", remainder);
        }

        // Close the scanner
        scanner.close();
    }
}

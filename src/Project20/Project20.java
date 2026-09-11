package Project20;

import java.util.Scanner;

public class Project20{

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // User for input
        System.out.print("Enter hourly rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Perform calculations
        double grossPay = rate * hoursWorked;
        double tax = grossPay * 0.12; // 12% of gross pay
        double netPay = grossPay - tax;

        // Output
        System.out.println("\n--- Pay Details ---");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Tax (12%%): Php %.2f%n", tax);
        System.out.printf("Net Pay:   Php %.2f%n", netPay);

        // Close the scanner
        scanner.close();
    }
}

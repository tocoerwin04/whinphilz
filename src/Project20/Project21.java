import java.util.Scanner;

public class Project21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        //input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        //output
        if (num1 > num2) {
            System.out.println("The highest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The highest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Project23 {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        //Promt user to input
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter a number to generate its multiplication table: ");
        int num = scanner.nextInt();

        //Output
        System.out.println("\nMultiplication Table for " + num + ":");
        System.out.println("-----------------------------");

        // Looping statement
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.printf("%d x %d = %d%n", num, i, product);
        }

        // Close the scanner
        scanner.close();
    }
}

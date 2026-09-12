import java.util.Scanner;

public class Project24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to Project 24, Please proceed!");
        System.out.println();
        boolean isValid = false;

        while (!isValid) {
            System.out.println("--- Triangle Classifier ---");
            
            try {
                // Read three angles
                System.out.print("Enter first angle: ");
                double angle1 = scanner.nextDouble();

                System.out.print("Enter second angle: ");
                double angle2 = scanner.nextDouble();

                System.out.print("Enter third angle: ");
                double angle3 = scanner.nextDouble();

                // Validate positive angles
                if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
                    System.out.println("Invalid triangle: All angles must be greater than 0.\n");
                    continue;
                }

                // Check angle sum
                double sum = angle1 + angle2 + angle3;
                if (sum != 180) {
                    System.out.println("Invalid triangle: The sum of angles is " + sum + "°, but it must be 180°.\n");
                    continue;
                }

                // If code reaches here, the triangle is valid
                isValid = true;
                System.out.println("\nResult: Valid Triangle!");

                // Determine triangle type
                if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    System.out.println("Type: Right Triangle (contains one 90° angle)");
                } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                    System.out.println("Type: Obtuse Triangle (contains one angle greater than 90°)");
                } else {
                    System.out.println("Type: Acute Triangle (all angles are less than 90°)");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numerical values.\n");
                scanner.nextLine(); // Clear scanner buffer
            }
        }

        scanner.close();
    }
}

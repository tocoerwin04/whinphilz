import java.util.Scanner;

public class Project24 {

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        
        double angle1, angle2, angle3;
        boolean isValidTriangle = false;

        // Looping satement
        do {
            System.out.println("\n--- Enter the 3 angles of the triangle ---");
            System.out.print("Enter Angle 1: ");
            angle1 = scanner.nextDouble();

            System.out.print("Enter Angle 2: ");
            angle2 = scanner.nextDouble();

            System.out.print("Enter Angle 3: ");
            angle3 = scanner.nextDouble();

            // Rule 1: Sum must equal to 180
            double sum = angle1 + angle2 + angle3;
            
            // Rule 2: Each individual angle must be greater than 0  
            if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
                isValidTriangle = true;
                System.out.println("Result: This is a VALID triangle.");
                
                // Determining the triangle
                if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    System.out.println("Type: Right Triangle (contains a 90-degree angle)");
                } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                    System.out.println("Type: Acute Triangle (all angles are less than 90 degrees)");
                } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                    System.out.println("Type: Obtuse Triangle (contains one angle greater than 90 degrees)");
                }
            } else {
                System.out.println("Result: INVALID triangle! The angles must be positive and equal 180° in total. Please try again.");
            }

        } while (!isValidTriangle); // Loop continues as long as it is false

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class Project22 {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Conditional output
        if (angle > 0 && angle < 90) {
            System.out.println("The angle is: Acute");
        } else if (angle == 90) {
            System.out.println("The angle is: Right");
        } else if (angle > 90 && angle < 180) {
            System.out.println("The angle is: Obtuse");
        } else if (angle == 180) {
            System.out.println("The angle is: Straight");
        } else if (angle > 180 && angle < 360) {
            System.out.println("The angle is: Reflex");
        } else if (angle == 360) {
            System.out.println("The angle is: Full Rotation");
        } else {
            System.out.println("The angle is: Invalid angle");
        }

        // Close the scanner
        scanner.close();
    }
}

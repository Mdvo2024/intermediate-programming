package Game;
 import java.util.Scanner;

public class ErrorCheck {
    public static int getInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.next(); // Clear invalid input
        }
        return sc.nextInt();
    }
}


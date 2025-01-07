//Copyright 2024 Miles Dvorett
import java.util.ArrayList;
import java.util.Scanner;

public class NumberGuessGame {
    ArrayList<Integer> pastGuesses = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int minRange, maxRange;
    int guessCount = 0;

        public void playGame() {
        System.out.println("Welcome to Miles' number game!");
        // Get range from user
       
        System.out.print("Enter the minimum value: ");
        minRange =  Checker(scanner);
    
    
        System.out.print("Enter the maximum value: ");
        maxRange =  Checker(scanner);

        if (minRange >= maxRange) {
            System.out.println("Invalid range, Minimum is greater than maximum.");
            System.out.print("Enter the minimum range: ");
            minRange = scanner.nextInt();
            System.out.print("Enter the maximum range: ");
            maxRange = scanner.nextInt();
        }

        // Generate random number
        int randomNumber = minRange + (int)(Math.random() * ((maxRange - minRange) + 1));
        boolean guessedCorrectly = false;

        // Guessing loop
        while (!guessedCorrectly) { //https://www.geeksforgeeks.org/java-while-loop-with-examples/
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) { //number is not an integer
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
                continue; // https://www.geeksforgeeks.org/continue-statement-in-java/
            }

            int userGuess = scanner.nextInt();
            guessCount++;

            if (pastGuesses.contains(userGuess)) {
                System.out.println("You've already guessed that number! Try again.");
                continue;
            }
            pastGuesses.add(userGuess);

            if (userGuess < randomNumber) {
                System.out.println("The number is higher. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("The number is lower. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
                guessedCorrectly = true;
            }
        }

        // scanner.close();
    }

    public int Checker(Scanner scanner) {
        if (!scanner.hasNextInt()) { //number is not an integer
        System.out.println("Invalid input. Please enter a number.");
        scanner.next(); // Clear invalid input
        return Checker(scanner);
        }
    else { 
        return scanner.nextInt();
    }
    }
}
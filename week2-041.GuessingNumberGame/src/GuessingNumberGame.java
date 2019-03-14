
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numOfGuesses = 0;

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        numOfGuesses++;
        
        while(numberDrawn != guess) {
            if(guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + numOfGuesses);
            }
            else {
                System.out.println("The number is lesser, guesses made: " + numOfGuesses);
            }
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            numOfGuesses++;
        }
        
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

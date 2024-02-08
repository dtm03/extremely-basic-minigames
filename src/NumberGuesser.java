import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    static Integer num = new Random().nextInt(100) + 1;
    static Integer tries = 0;

    public static void main(String[] args) {
        // openUI();
        nextRound();
    }

    private static void nextRound() {
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please enter your guess:");
        Integer guess = intScanner.nextInt();
        guess(guess);
    }

    private static void guess(Integer guess) {
        if (num == guess) {
            System.out.println("You guessed right! Congrats!");
            System.out.println("You needed " + tries + " tries to get there.");
            System.out.println("Do you want to play another round? (y/n)");
            restart();
        } else {
            System.out.println("You guessed wrong! The number you guessed is too " + (num < guess ? "high." : "low."));
            tries++;
            nextRound();
        }
    }

    private static void restart() {
        Scanner charScanner = new Scanner(System.in);
        String restart = charScanner.next();
        if (restart.equalsIgnoreCase("y")) {
            System.out.println("Welcome back!");
            tries = 0;
            num = new Random().nextInt(100) + 1;
            nextRound();
        } else {
            System.out.println("Thank you for playing!");
        }
    }

}

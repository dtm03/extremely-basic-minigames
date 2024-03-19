import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    int dice;
    int guessedNumber;
    int numberOfTries = 0;
    Scanner scanner = new Scanner(System.in);

    public void shakeDiceUntilSix() {

        do {

            dice = new Random().nextInt(6) + 1;

            switch (dice) {
                case 1:
                    System.out.println("Eins");
                    break;
                case 2:
                    System.out.println("Zwei");
                    break;
                case 3:
                    System.out.println("Drei");
                    break;
                case 4:
                    System.out.println("Vier");
                    break;
                case 5:
                    System.out.println("Fünf");
                    break;
                case 6:
                    System.out.println("Sechs");
                    break;
            }
            numberOfTries++;

        } while (dice != 6);
    }

    public void runGame() {
        System.out.println("How many Tries until 6 is reached?");
        guessedNumber = scanner.nextInt();
        this.shakeDiceUntilSix();
        System.out.println("Guessed Number of Tries: " + guessedNumber);
        System.out.println("Number of Tries: " + numberOfTries);
        System.out.println(numberOfTries == guessedNumber ? "You have guessed correctly" : "Your guess was incorrect");
    }

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.runGame();
    }
}

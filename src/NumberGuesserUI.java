import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesserUI {

    static Integer num = new Random().nextInt(100) + 1;
    static Integer tries = 0;

    static String standardText = "Please enter a number between 0 and 100";
    static JLabel text = new JLabel(standardText);
    static JLabel numberOfTries = new JLabel("Tries: " + tries);

    public static void main(String[] args) {
        openUI();
    }

    private static void guess(Integer guess) {
        if (num == guess) {
            text.setText("You guessed right! Congrats!");
        } else {
            text.setText("The number you guessed is too " + (num < guess ? "high." : "low."));
            tries++;
            numberOfTries.setText("Tries: " + tries);
        }
    }

    public static void openUI() {
        JFrame frame = new JFrame("Guess the number!");
        frame.setSize(400, 400);
        frame.setLocation(500, 80);
        frame.setDefaultCloseOperation(3);

        text.setBounds(50, 100, 350, 30);

        JTextField textField = new JTextField();
        textField.setBounds(50, 150, 200, 30);

        JButton button = new JButton("Guess");
        button.setBounds(50, 200, 200, 30);

        numberOfTries.setBounds(50, 250, 200, 30);

        button.addActionListener(e -> {
            Integer guess = Integer.parseInt(textField.getText());
            guess(guess);
        });

        frame.add(text);
        frame.add(textField);
        frame.add(button);
        frame.add(numberOfTries);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int numberOfCards = Integer.parseInt(scanner.nextLine());

        String[] definitions = new String[numberOfCards];
        String[] answers = new String[numberOfCards];

        for(int i = 0; i < numberOfCards; i++) {
            System.out.println("The card #" + (i + 1) + ":");
            definitions[i] = scanner.nextLine();
            System.out.println("The definition of the card #" + (i + 1) + ":");
            answers[i] = scanner.nextLine();
        }

        for(int i = 0; i < numberOfCards; i++) {
            System.out.println("Print the definition of \"" + definitions[i] + "\":");
            String input = scanner.nextLine();
            System.out.println(input.equals(answers[i]) ? "Correct answer." : "Wrong answer. The correct one is \"" + answers[i] + "\".");
        }


    }
}

package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String term = scanner.nextLine();
        String definition = scanner.nextLine();
        String answer = scanner.nextLine();

        System.out.println(definition.equals(answer) ? "rigt" : "wrong");
    }
}

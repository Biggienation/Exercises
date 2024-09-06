package vecka2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TextBook textBook = run();



    }

    public static TextBook run() {
        int pages;
        while(true) {
            System.out.println("How many pages do you want in your Textbook");
            try {
                pages = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.nextLine();
            }

        }
        return new TextBook(pages);
    }
}

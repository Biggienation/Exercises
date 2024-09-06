package vecka1;

import java.util.Scanner;
public class Vecka1Ovning1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        String firstLetter = name.substring(0, 1).toUpperCase();
        System.out.println("Hello " + firstLetter + name.substring(1));
    }
}

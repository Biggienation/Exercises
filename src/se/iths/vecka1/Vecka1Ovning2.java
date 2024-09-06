package vecka1;

import java.util.Scanner;
public class Vecka1Ovning2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter two whole numbers: ");
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println("The average value is:");
        System.out.println((double) (x+y)/2);
    }
}

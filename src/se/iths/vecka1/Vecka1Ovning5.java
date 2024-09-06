package vecka1;

import java.util.Scanner;
import java.util.Arrays;

public class Vecka1Ovning5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter three numbers");
        System.out.println("Seperate them with ','");
        String numbers = scanner.nextLine();

        String[] arg = numbers.split(",");

        if (arg.length != 3) {
            System.out.println("Du skrev in fler eller färre än 3 tal");
            return;
        }

        int[] numbersArray = new int[3];

        for (int i = 0; i < 3; i++) {
            try {
                numbersArray[i] = Integer.parseInt(arg[i].trim());
            } catch (NumberFormatException e) {
                System.out.println( "Opps " + arg[i] + " is not a number" );
                numbersArray[i] = 0;
            }

        }

        System.out.println(Arrays.toString(numbersArray));

        int max = 0;
        for (int i: numbersArray) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("The highest number is " + max);

    }
}

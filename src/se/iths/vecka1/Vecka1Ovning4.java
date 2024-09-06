package vecka1;

import java.util.Scanner;
public class Vecka1Ovning4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What day is it: ");
        String day = scanner.nextLine();

        var result = switch(day.toLowerCase()){
            case "mon","monday" -> 1;
            case "tue","tuesday" -> 2;
            case "wed","wednesday" -> 3;
            case "thu","thursday" -> 4;
            case "fri","friday" -> 5;
            case "sat","saturday" -> 6;
            case "sun","sunday" -> 7;
            default -> 0;
        };
        if (result == 0 ){
            System.out.println(day + " is not a day of the week");
        } else {
            System.out.println(day + " is day number: " + result + " in a week");
        }

    }
}

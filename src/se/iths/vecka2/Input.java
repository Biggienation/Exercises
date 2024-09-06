package vecka2;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String inputString (){
        String input;
        while(true){
            System.out.println("Enter a string: ");
            try{
                input = scanner.nextLine();
                return input;
            } catch(Exception e){
                System.out.println("Invalid input. Try again.");
                scanner.nextLine();
            }
        }
    }
    public static String inputString (String[] arg){
        while (true){
            System.out.println("Enter a password ");
            String input = scanner.nextLine();
            for(String a: arg){
                if(input.equalsIgnoreCase(a)){
                    return input;
                }
            }
            System.out.println("Invalid input. Try again.");
        }
    }
    public static int inputInt (){
        int input;
        while(true){
            try{
                System.out.println("Enter a Integer: ");
                input = scanner.nextInt();
                return input;
            } catch(Exception e){
                System.out.println("Invalid input. Try again.");
                scanner.nextLine();
            }
        }
    }
    public static float inputFloat(){
        float input;
        while(true){
            System.out.println("Enter a float: ");
            try{
                input = scanner.nextFloat();
                return input;
            } catch(Exception e){
                System.out.println("Invalid input. Try again.");
                scanner.nextLine();
            }
        }
    }
    public static double inputDouble(){
        double input;
        while(true){
            System.out.println("Enter a double: ");
            try{
                input = scanner.nextDouble();
                return input;
            } catch(Exception e){
                System.out.println("Invalid input. Try again.");
                scanner.nextLine();
            }
        }
    }
    public static boolean inputBoolean(){
        while(true){
            System.out.println("Enter yes or no: ");
            String input = scanner.next();
            switch(input.toLowerCase()){
                case "yes","ja","j","y" -> {return true;}
                case "no","nej","n" -> {return false;}
                default -> {
                    System.out.println("invalid input. Try again.");
                    continue;}
            }
        }
    }
}

package vecka2;

import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(password(input));

    }

    public static boolean password (String password) {
        if (password.length() > 10) {
            if (password.matches("^[\\w]+$")){
                if (password.matches("(\\D*\\d){2,}")){
                    return true;
                }
            }

        }
        return false;
    }

    // im not sure how regex works
}

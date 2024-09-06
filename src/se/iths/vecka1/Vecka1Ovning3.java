package vecka1;

import java.util.Scanner;

public class Vecka1Ovning3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }

        if (x == y) {
            System.out.println((x + y) * 2);
        } else {
            System.out.println(x + y);
        }
    }
}

package vecka1;

public class Vecka1Ovning8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int x = 0;
        int count = 0;
        int result = 0;

        for (int i = 2; i < numbers.length; i += 2) {
            count++;

            int space1 = numbers[x];
            int space2 = numbers[1 + x];
            int space3 = numbers[2 + x];
            int space4 = numbers[3 + x];

            if (space1 == space3 || space1 == space4 || space2 == space3 || space2 == space4) {
                result++;
            }

            x += 2;
        }

        if (result == count) {
            System.out.println("Everywhere");
        } else if (result == 0) {
            System.out.println("Nowhere");
        } else {
            System.out.println("Somewhere ");
        }


    }
}

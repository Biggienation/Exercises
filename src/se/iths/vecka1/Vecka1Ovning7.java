package vecka1;

import java.util.Arrays;
public class Vecka1Ovning7 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[10];
        int counter = 0;

        for (int i = 9; i >= 0; i--) {
            array2[counter] = array1[i];
            counter++;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int summa1 = 0;
        int summa2 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                summa1 += array1[i];
                summa2 += array2[i];
            }
        }

        System.out.println("Array 1: " + summa1);
        System.out.println("Array 2: " + summa2);
    }
}

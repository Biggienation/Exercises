package vecka1;

import java.util.Arrays;
public class Vecka1Ovning6 {
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

    }
}

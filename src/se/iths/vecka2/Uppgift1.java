package vecka2;

public class Uppgift1 {
    public static void main(String[] args) {
        int[] numbers = {3,4,6};
        int smallest = smallestNumber(numbers);
        System.out.println(smallest);

    }

    public static int smallestNumber (int[] numbers)  {
        int x = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (x > numbers[i]){
                x = numbers[i];
            }
        }
        return x;
    }
}

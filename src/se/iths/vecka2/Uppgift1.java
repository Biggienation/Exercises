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

/*
* Can use the Math.min() but that method can only take in 2 variable
*public static int findMinimum(int a, int b, int c){
*   int min = Math.min(a, b);
*   min = Math.min(min, c);
*   return min;
* }
* But my solution was right as well
* A arrays take more time. If there is a small amount of variables then it's faster to just input the variables
* */
package vecka2;

import java.util.Scanner;
public class Uppgift3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter palindrome");
        var input = sc.nextLine();
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String str){
        String reverse = "";
        str = str.toLowerCase();
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);

        /* Stringbuffer class has a method for .reverse()
         StringBuffer sb = new StringBuffer(str)
         Stringbuffer rev = sb.reverse */

        /* StringBuilder class also has a method for .reverse()
        StringBuilder sbl = new Stringbuilder()
        sbl.reverse();
         */
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return number == reverse;

        /* StringBuffer sb = new StringBuffer(String.valueOf(number)
         or Stringbuilder sbl = new stringBuilder ();
         sbl.append(number)
         sbl.reverse
         */
    }
}

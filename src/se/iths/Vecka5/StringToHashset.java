package Vecka5;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringToHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(stringToHashSet(input));

    }

    public static Set<String> stringToHashSet(String input) {
        input = input.replace(",","");
        String[] words = input.split(" ");
        return new HashSet<>(List.of(words));
        // return new Hashset<>(List.of(input.toLowerCase().split("")));

    }
}

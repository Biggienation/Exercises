package Vecka5;

import java.util.ArrayList;
import java.util.List;

public class StringToList {
    public static void main(String[] args) {
        String[] stringArray = {"A", "B", "C", "D", "E", "F", "G", "H"};
        List<String> list = toList(stringArray);
        System.out.println(list);
        System.out.println(reverse(list));
    }

    private static List<String> toList(String[] stringArray) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of(stringArray));
        return list;
    }

    public static List<String> reverse(List<String> stringList) {
        List<String> reversed = List.copyOf(stringList);
        return reversed.reversed();
    }
}

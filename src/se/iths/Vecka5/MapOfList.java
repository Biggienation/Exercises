package Vecka5;


import java.util.*;

public class MapOfList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this is a word list");
        list.add("this is a word");
        list.add("this is a sentence");

        Map<String, Set<Integer>> map = indexWords(list);
        for (Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Set<Integer>> indexWords(List<String> words) {
        Map<String, Set<Integer>> map = new HashMap<>();

        for(int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String[] split = word.split(" ");
            for(String s : split) {
                s = s.toLowerCase();
                map.putIfAbsent(s, new HashSet<>());
                map.get(s).add(i);
            }
        }
        return map;
    }
}

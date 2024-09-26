package Vecka5;

import java.util.*;

public class WordIndexer {

    public static Map<String, Set<Integer>> indexWords(List<String> texts) {
        Map<String, Set<Integer>> wordIndex = new HashMap<>();

        for (int i = 0; i < texts.size(); i++) {
            String text = texts.get(i);
            // Dela texten i ord (enkel hantering av mellanrum)
            String[] words = text.split("\\s+");

            for (String word : words) {
                // Normalisera ord (kan göras mer avancerat om så önskas, t.ex. ta bort punkter)
                word = word.toLowerCase(); // Konvertera till gemener

                // Lägg till ordet i mappen, om det inte redan finns
                wordIndex.putIfAbsent(word, new HashSet<>());
                wordIndex.get(word).add(i); // Lägg till indexet
            }
        }

        return wordIndex;
    }

    public static void main(String[] args) {
        List<String> texts = Arrays.asList(
                "Det här är en text.",
                "Den här texten innehåller ord.",
                "Text är viktigt."
        );

        Map<String, Set<Integer>> index = indexWords(texts);

        // Utskrift av index
        for (Map.Entry<String, Set<Integer>> entry : index.entrySet()) {
            System.out.println("Ord: '" + entry.getKey() + "' förekommer i index: " + entry.getValue());
        }
    }
}
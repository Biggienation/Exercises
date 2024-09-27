package Vecka5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryHashMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Capitals capitals = new Capitals();
        String input = scan.nextLine();
        System.out.println(capitals.getCountryCapital(input));

    }

    public static class Capitals {
        public Map<String, String> countryCapitalMap = new HashMap<String,String>();
        public Capitals() {
            countryCapitalMap.put("United States", "Washington, D.C.");
            countryCapitalMap.put("Canada", "Ottawa");
            countryCapitalMap.put("United Kingdom", "London");
            countryCapitalMap.put("France", "Paris");
            countryCapitalMap.put("Germany", "Berlin");
            countryCapitalMap.put("Italy", "Rome");
            countryCapitalMap.put("Spain", "Madrid");
            countryCapitalMap.put("Australia", "Canberra");
            countryCapitalMap.put("India", "New Delhi");
            countryCapitalMap.put("Japan", "Tokyo");
            countryCapitalMap.put("China", "Beijing");
            countryCapitalMap.put("Brazil", "Brasília");
            countryCapitalMap.put("Russia", "Moscow");
            countryCapitalMap.put("Mexico", "Mexico City");
            countryCapitalMap.put("South Africa", "Pretoria (administrative), Bloemfontein (judicial), Cape Town (legislative)");
        }

        public String getCountryCapital(String country) {
            if(!countryCapitalMap.containsKey(country))
                return "Country Not Found";
            return countryCapitalMap.get(country);
            //Can also use .getOrDefault(country,"Country Not Found")
            //return countryCapitalMap.computeIfAbsent(country, k -> "Country Not Found");
        }
    }
}

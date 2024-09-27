package Vecka5.ExerciseFromClass;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        // Adding elements to the ArrayList
        list.add("Coffee");
        list.add("Tea");
        // Accessing an element in the Arraylist
        String index0 = list.get(0);
        String index1 = list.get(1);
        String first = list.getFirst();
        String last = list.getLast();
        // Modifying and element int the ArrayList
        list.set(1, "Espresso");
        //Removing an element from the ArrayList
        //list.remove(1) by index
        //String removedITem = list.remove(1)
        boolean removed = list.remove("Coffee");
        // All Variables that previosly referenced the removed value
        // Will still have a reference to the value. This is why
        //index0 still returns "Coffee" even if we removed it
        System.out.println(index0);
        System.out.println(list);
        // Checking if the Arraylist is empty
        if (list.isEmpty())
            System.out.println("List is empty");
        //Checking the size of the ArrayList
        System.out.println("list size" + list.size());
        //Checking if an object exists in the Arraylist
        list.add("tea");
        list.add("tea");
        String tea = "tea";
        if (list.contains(tea)) System.out.println("List contains tea");
        //What index does tea have? if an object isn't in the list it returns -1
        int firstIndex = list.indexOf(tea);
        System.out.println("First index of tea is " + firstIndex);
        int lastIndex = list.lastIndexOf(tea);
        System.out.println("Last index of tea is " + lastIndex);

        //for(;;) is the same as while(true)
        System.out.println(list);
        //Costume sorting of the objects in the ArrayList with Comparator
        list.sort((o1, o2) -> o1.substring(1).compareTo(o2.substring(1)));
        System.out.println(list);



    }
}

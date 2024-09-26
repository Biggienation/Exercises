package Vecka5;

import java.util.*;

public class ArrayList_Uppgift {
    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        list.isEmpty();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.remove(1);
        list.print();
        System.out.println(list.listReturn(0));
        System.out.println(list.size());
        System.out.println(list);
        list.sortReverse();
        System.out.println(list);


    }
}

class ArrayList_ {
    public ArrayList<Integer> list;
    public ArrayList_() {
        list = new ArrayList<>();
    }

    public void add(int i) {
        list.add(i);
    }

    public Integer listReturn(int i) {
        return list.get(i);
    }

    public void remove(int i) {
        list.remove(i);
    }

    public void print(){
        list.forEach(System.out::println);
    }

    public void isEmpty(){
        if(list.isEmpty()){
            System.out.println("List is empty");
        }
    }

    public int size(){
        return list.size();
    }

    public boolean contains(int i){
        return list.contains(i);
    }


    @Override
    public String toString() {
        return  "" + list;

    }

    Comparator<Integer> comparator = new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };

    public void sortReverse() {
        list.sort(comparator);
    }

}

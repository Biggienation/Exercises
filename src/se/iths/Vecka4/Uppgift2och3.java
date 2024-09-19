package Vecka4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Uppgift2och3 {
    public static void main(String[] args) {
        Animal c = new Cat(2);
        Animal d = new Dog(3);
        Animal e = new Cat(2);
        Cat q = new Cat(2);

        System.out.println(c.toString());
        System.out.println(d.toString());

        if (c.equals(d)){
            System.out.println("Are the same");
        }else {
            System.out.println("Are not the same");
        }

        if (c.equals(e)){
            System.out.println("Are the same");
        }else {
            System.out.println("Are not the same");
        }

        if (c.equals(q)){
            System.out.println("Are the same");
        }else {
            System.out.println("Are not the same");
        }

        System.out.println(d.compareTo(c));

        Animal[] animals = {c, d, e, q};
        System.out.println(Arrays.toString(animals));
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
        /*
        Arrays.sort(animals, Comparator.comparingInt((Animal o) -> o.size).reversed());
        System.out.println(Arrays.toString(animals));
        If this two things are the same .thenComnaringInt() can be used to compare other things.
        */

    }
}

abstract class Animal implements Comparable<Animal>{
    String name;
    int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void changeSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return size == animal.size && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    public int compareTo(Animal animal) {
        return this.size - animal.getSize();
    }
}

class Dog extends Animal {
    public Dog(int size) {
        super("Dog", size);
    }
}

class Cat extends Animal {
    public Cat(int size) {
        super("Cat", size);
    }
}
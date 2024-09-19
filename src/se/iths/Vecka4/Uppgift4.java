package Vecka4;

import java.beans.Expression;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Uppgift4 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal Dog = new Dog(5);
        Animal Cat = new Cat(4);
        Animal Cat2 = new Cat(3);
        zoo.add(Dog);
        zoo.add(Cat);
        zoo.add(Cat2);
        System.out.println(zoo.toString());
    }
}
class Zoo implements Iterable<Animal> {
    Animal[] animals;
    public Zoo() {
        animals = new Animal[10];
    }
    public void add(Animal a){

    }

    public int getIndex(Animal a){
        for(int i = 0; i < animals.length; i++){
            if(animals[i].equals(a)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }

    @Override
    public Iterator<Animal> iterator() {
        return Zoo.this.iterator();
    }
}

package Vecka4;

public class NotThis {
}
/*class Zoo implements Iterable<Animal> {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    // Metod för att lägga till en Animal
    public void add(Animal animal) {
        animals.add(animal);
    }

    // Metod för att hämta en Animal vid specifikt index
    public Animal get(int index) {
        return animals.get(index);
    }

    // Implementera iterator-metoden så att Zoo kan itereras över
    @Override
    public Iterator<Animal> iterator() {
        return animals.iterator();
    }

    // Metod för att tillämpa en Consumer på varje Animal
    public void forEach(Consumer<? super Animal> action) {
        for (Animal animal : animals) {
            action.accept(animal);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Skapa ett Zoo och några Animal objekt
        Zoo zoo = new Zoo();
        zoo.add(new Animal("Lion"));
        zoo.add(new Animal("Elephant"));
        zoo.add(new Animal("Giraffe"));

        // Iterera över Zoo med en for-each loop
        System.out.println("Iterera med for-each loop:");
        for (Animal animal : zoo) {
            System.out.println(animal);
        }

        // Använd forEach metoden med en lambda för att skriva ut djuren
        System.out.println("\nAnvänd forEach metod med lambda:");
        zoo.forEach(animal -> System.out.println(animal));

        // Använd forEach metod med metodreferens för att skriva ut djuren
        System.out.println("\nAnvänd forEach metod med metodreferens:");
        zoo.forEach(System.out::println);
    }
}*/
/*
class Zoo implements Iterable<Animal> {
    private Animal[] animals;
    private int size; // Håller reda på hur många djur som faktiskt finns i arrayen

    public Zoo(int capacity) {
        animals = new Animal[capacity]; // Initiera arrayen med en fast storlek
        size = 0;
    }

public void add(Animal animal) {
        if (size < animals.length) {
            animals[size] = animal;
            size++;
        } else {
            System.out.println("Zoo är fullt, kan inte lägga till fler djur.");
        }
    }

    // Metod för att hämta en Animal vid specifikt index
    public Animal get(int index) {
        if (index >= 0 && index < size) {
            return animals[index];
        } else {
            throw new IndexOutOfBoundsException("Index utanför gränserna");
        }
    }

    // Implementera iterator-metoden så att Zoo kan itereras över
    @Override
    public Iterator<Animal> iterator() {
        return new Iterator<Animal>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Animal next() {
                return animals[currentIndex++];
            }
        };
    }

    // Metod för att tillämpa en Consumer på varje Animal
    public void forEach(Consumer<? super Animal> action) {
        for (int i = 0; i < size; i++) {
            action.accept(animals[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Skapa ett Zoo med kapacitet för 3 djur
        Zoo zoo = new Zoo(3);
        zoo.add(new Animal("Lion"));
        zoo.add(new Animal("Elephant"));
        zoo.add(new Animal("Giraffe"));

        // Försök att lägga till fler djur än kapaciteten
        zoo.add(new Animal("Monkey")); // Detta kommer inte att fungera, eftersom zoo är fullt

        // Iterera över Zoo med en for-each loop
        System.out.println("Iterera med for-each loop:");
        for (Animal animal : zoo) {
            System.out.println(animal);
        }

        // Använd forEach metoden med en lambda för att skriva ut djuren
        System.out.println("\nAnvänd forEach metod med lambda:");
        zoo.forEach(animal -> System.out.println(animal));

        // Använd forEach metod med metodreferens för att skriva ut djuren
        System.out.println("\nAnvänd forEach metod med metodreferens:");
        zoo.forEach(System.out::println);
    }
}
 */
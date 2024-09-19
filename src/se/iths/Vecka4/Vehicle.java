package Vecka4;

//fordonshierarki
public abstract sealed class Vehicle permits Car, Truck {
    private final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        switch (vehicle) {
            case Car car -> System.out.println("Car with registration number: " + car.getRegistrationNumber() +
                    ", Number of seats: " + car.getNumberOfSeats());
            case Truck truck -> System.out.println("Truck with registration number: " + truck.getRegistrationNumber() +
                    ", Load capacity: " + truck.getLoadCapacity() + " kg");
            default -> throw new IllegalStateException("Unexpected vehicle type: " + vehicle.getClass().getName());
        }
    }
}

final class Car extends Vehicle {
    private final int numberOfSeats;


    public Car(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

final class Truck extends Vehicle {
    private final int loadCapacity;

    public Truck(String registrationNumber, int loadCapacity) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", 5);
        Vehicle truck = new Truck("XYZ789", 10000);
        Vehicle truckb = new Truck("XYZ556", 10000);
        Vehicle.printVehicleDetails(car);
        Vehicle.printVehicleDetails(truck);
        Vehicle.printVehicleDetails(truckb);
    }
}
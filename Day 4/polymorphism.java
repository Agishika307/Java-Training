class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
    String type;
    int wheels;
    String color;
    Vehicle() {
        this.type = "Unknown";
        this.wheels = 0;
        this.color = "Unpainted";
    }
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
    @Override
    void stop() {
        System.out.println("Car is stopping");
    }

    void showType() {
        System.out.println("Type: " + type);
    }

    void showColor() {
        System.out.println("Color: " + color);
    }

    void showWheels() {
        System.out.println("Wheels: " + wheels);
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle is starting");
    }

    void showType() {
        System.out.println("Type: " + type);
    }

    void showColor() {
        System.out.println("Color: " + color);
    }

    void showWheels() {
        System.out.println("Wheels: " + wheels);
    }

    @Override
    void stop() {
        System.out.println("Motorcycle is stopping");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.start(); // Output: Car is starting
        v2.start(); // Output: Motorcycle is starting

        // The following methods are not available in Vehicle, so need to cast
        ((Car) v1).showColor();
        ((Car) v1).showType();
        ((Car) v1).showWheels();

        ((Motorcycle) v2).showColor();
        ((Motorcycle) v2).showType();
        ((Motorcycle) v2).showWheels();

        v1.stop(); // Output: Car is stopping
        v2.stop(); // Output: Motorcycle is stopping
    }
}
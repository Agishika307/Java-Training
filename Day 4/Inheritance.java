class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog Breed: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println("Cat Color: " + color);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    public void purr() {
        System.out.println(name + " is purring");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.makeSound();
        dog.sleep();
        dog.fetch();

        System.out.println();

        Cat cat = new Cat("Whiskers", 2, "Tabby");
        cat.displayInfo();
        cat.makeSound();
        cat.sleep();
        cat.purr();
    }
}
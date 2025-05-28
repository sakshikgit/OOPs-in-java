package Abstraction;

// Abstract class Animal
abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();
}

// Dog class that extends Animal
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Cat class that extends Animal
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Main class to test runtime polymorphism
public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog("Bruno");    // Upcasting
        Animal myCat = new Cat("Kitty");    // Upcasting

        myDog.makeSound();  // Runtime polymorphism - calls Dog's version
        myCat.makeSound();  // Runtime polymorphism - calls Cat's version
    }
}



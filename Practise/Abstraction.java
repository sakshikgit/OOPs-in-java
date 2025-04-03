package Practise;

abstract class Animal{// abstract class

    String name;

    Animal(String name){
        this.name = name;
    }// constructor

    //Abstractor method
    abstract void makeSound();
}

class Dog extends Animal{
    Dog(String name ){
        super(name);

    }

    @Override
    void makeSound(){
        System.out.println(name + "says: Woof!");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);

    }
    @Override
    void makeSound(){
        System.out.println(name + "Says: Meow!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Using runtime polymorphism
        // Animal myDog = new Dog("Buddy");
        // Animal myCat = new Cat("Whiskers");

        Dog myDog = new Dog("blacky");
        Cat myCat = new Cat("rani");

        myDog.makeSound(); // Output: Buddy says: Woof!
        myCat.makeSound(); // Output: Whiskers says: Meow!

        
    }
    
}

class A extends Object{
    // every class in java extends Object (class in java which has lot of methods) , even if don't mention 
    public A()
    {
        super();
    System.out.println("in A");
    }

    public A(int n){
        System.out.println("in A int");
    }


}

class B extends A{
    public B()
    {    super();// call the constructor of the super class but default one 
                 // and u want to call the parameterized constructor of the super class
                 // than pass the value in super
         //every constructor in java has a method , which is there even if you don't mentionand that method is super 

        System.out.println("in B");
    }

    public B(int n){
       // super(n);
       this(); // this will execute the constructor of the same class

        System.out.println("in B int");
    }


}


public class ThisAndSuper {
    public static void main(String a[]){

        // B obj = new B();
        // we have only created the object of class B , but constrector is callin for both A and B this means 
        // when u create a object of class it will call the constrector of subclass and superclass both

        B obj = new B(10);

        // i want to execute both constructor of B with one object so 


       
    }
    
}

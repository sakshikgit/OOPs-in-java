package staticExample;


public class Main {
    public static void main(String[] args) {
        // Human sakshi = new Human(20, "sakshi", 100000, false);
        // Human sakhi = new Human(20, "sakhi", 100000, true);

        // System.out.println(Human.population);

        
    }

// this is not dependent on objects
    static void fun(){
       // greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances
        

        // you can't access non static stuff without referencing their instances in a static context
        // hence, i am referencing it
        Main obj = new Main();
        obj.greeting();

    }


    // we know that something which is not static, belong to an object
    void greeting(){
        System.out.println("Hello world");
    }

}

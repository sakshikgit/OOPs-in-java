package staticExample;

public class Human {
    int age;
    String name;
    int Salary;
    boolean married;
    static long population;
    


public Human(int age, String name, int Salary, boolean married){
    this.age = age;
    this.name = name;
    this.Salary = Salary;
    this.married = married;
    Human.population += 1;
}
}

package Practise;

class Employee{
    public String name;
    public int Id;

    Employee(String name, int id) {
        this.name = name;
        this.Id = Id;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + Id);
    }

}

class Manager extends Employee {
    public int teamSize;
    Manager(String name, int Id, int teamSize){
        super(name, Id); // Calls Employee constructor
        this.teamSize = teamSize;

    }

     // Overriding displayDetails() for Manager
     @Override
    public void displayDetails(){
        System.out.println("Manager Details");
        super.displayDetails(); // Calls Employee's displayDetails()
        System.out.println("TeamSize: " + teamSize);
    }



}

class Engineer extends Employee{
    public String specialization;

    
    Engineer(String name, int Id, String specialization){
        super(name, Id); // Calls Employee constructor
        this.specialization = specialization;
    }


    // Overriding displayDetails() for Engineer
    @Override
    public void displayDetails(){
        System.out.println("Engineer Details");
        super.displayDetails(); // Calls Employee's displayDetails()
        System.out.println("Specialization: " + specialization);
    }

}







public class Inheritance {
    public static void main(String[] args) {
        // Employee e = new Employee();
        Manager m = new Manager("sakshi", 111, 20);
        Engineer er = new Engineer("sakshi", 222, "Full Stack Developer");
        m.displayDetails();
        er.displayDetails();
        // e.displayDetails();
        
    }
    
}

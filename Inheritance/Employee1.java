package Inheritance;

public class Employee1 {
    public String name;
    public int ID;

    public Employee1(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);
    }
    
}

 class Manager extends Employee1 {

    private int teamSize;

    public Manager(String name, int ID, int teamSize){
        super(name, ID);
        this.teamSize = teamSize;
    }
    
   @Override
   public void displayDetails(){
    super.displayDetails();
    System.out.println("Team Size: " + teamSize);
   }  
}

 class Engineer extends Employee1 {

    private String specialization;

    public Engineer(String name, int ID, String specialization){
        super(name, ID);
        this.specialization = specialization;
    }

     @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent class method
        System.out.println("Specialization: " + specialization);
    
}

}

// Main class to test the hierarchy
  public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 5);
        Engineer engineer = new Engineer("Bob", 102, "Software Development");

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nEngineer Details:");
        engineer.displayDetails();
    }
}
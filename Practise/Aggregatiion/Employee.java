package Practise.Aggregatiion;

public class Employee {
    // Private String name;
    private String name;
    private int id;
    private Department department; // Aggrigation

    public Employee(String name, int id, Department department){
        this.name = name;
        this.id = id;
        this.department = department;

    }

    public void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department Details:");
        department.displayDetails(); // Aggregation usage

    }
    
}

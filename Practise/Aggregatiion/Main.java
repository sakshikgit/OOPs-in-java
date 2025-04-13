package Practise.Aggregatiion;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Software Engineering", "D101");

          // Create employees belonging to that department
          Employee emp1 = new Employee("Alice", 1001, dept);
          Employee emp2 = new Employee("Bob", 1002, dept);
  
          // Display their details
          emp1.displayDetails();
          System.out.println();
          emp2.displayDetails();
    }
    
}

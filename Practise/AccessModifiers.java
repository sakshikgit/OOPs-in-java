package Practise;

 class Employee{
    public String name;
    protected int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary){
        this.name = name;
        this.employeeId = employeeId;
        
        if(salary < 0){
            System.out.println("Invalid Salary");
            this.salary = 0;
        }else{
            this.salary = salary;
        }

    }

    public void setSalary(double salary){
        
        if(salary < 0){
            System.out.println("Invalid salary");
            this.salary = 0;
        }else{
            this.salary = salary;
        }

    }

    public double getSalary(){
        return salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Salary: " + String.format("%.2f", getSalary()));
        System.out.println("Name: " + name);
        System.out.println("EmployeeId: " + employeeId);


    }

    
}

public class AccessModifiers {
    public static void main(String[] args) {
        Employee obj1 = new Employee("sakshi", 12, 1000000);
        obj1.displayEmployeeDetails();
        
    }
    
}

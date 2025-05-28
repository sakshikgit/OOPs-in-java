package Encapsulation;

public class Employee {
    public String name;
    protected Integer employeeId;
    private double salary;

    public Employee(String name, Integer employeeId, double salary){
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public void setSalary(double salary){
        this.salary = salary;
        if(salary < 0){
            System.out.println("Invalid salary");
            this.salary = 0;
        }
    }

    public double getSalary(){
        return salary;

    }

    public void displayEmployeeDetails(){
        System.out.println("Salary : " + salary);
        System.out.println("Name : " + name);
        System.out.println("Employee Id : " + employeeId);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("sakshi", 10101, 1000000);

        System.out.println("Salary : " + emp.getSalary());

        emp.setSalary(100000);

        emp.displayEmployeeDetails();
        
    }
    
}

package Practise.Aggregatiion;

public class Department {
    private String name;
    private String id;

   public Department(String name, String id){
        this.name = name;
        this.id = id;
 }

 public void displayDetails(){
    System.out.println("Department Name:" + name);
    System.out.println("Department ID: " + id);

 }

 public String getName(){
    return name;
 }

 public String getId(){
    return id;
 }

    
}

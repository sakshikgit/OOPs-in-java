package Practise;

class Rectangle{
    private double length;
    private double width;
    // private double area;

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
        
    }

    public void displayDetails(){
        System.out.println("Length: " + String.format("%.2f", length));
        System.out.println("Width: " + String.format("%.2f", width));
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        
        
    }


}

public class Constructors {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.displayDetails();;
        Rectangle rectangle2 = new Rectangle(5.00, 3.00);
        rectangle2.displayDetails();
        
    }
    
}

package Practise;

class ShapeCalculator{
    public int radius;
    public int length;
    public int width;
    public int base1;
    public int base2;
    public double height;



    public int area(int r){
        return (int)Math.PI*r*r;

    }

    public int area(int l, int w){
        return l*w;

    }

    public double area(int b1, int b2, double h){
        return ((b1 + b2) * h / 2.0);

    }
}

public class Polymorphism {
    public static void main(String[] args) {
        ShapeCalculator shc = new ShapeCalculator();
        
        System.out.println("Circle Area: " + shc.area(2));
System.out.println("Rectangle Area: " + shc.area(2, 3));
System.out.println("Trapezoid Area: " + shc.area(2, 3, 2.0));
    }

    
}

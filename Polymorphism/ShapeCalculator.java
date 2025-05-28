package Polymorphism;

import Polymorphism.ShapeCalculator.InnerShapeCalculator;

public class ShapeCalculator {

    public static void main(String[] args){
        ShapeCalculator sc = new ShapeCalculator(); // Create outer class object
        InnerShapeCalculator shpc = sc.new InnerShapeCalculator();
        shpc.area(7);
        shpc.area(3, 4);
        shpc.area(5, 3, 7);

    }

     class InnerShapeCalculator {

         public int radius;

    public void area(int radius){
        double circle = Math.PI * radius * radius;

        System.out.println("Circle Area : " + circle);
    }

    public void area(int length, int width){
        int rectangle = length * width;

        System.out.println("Rectangle Area : " + rectangle);
    }

    public void area(int height, int base1, int base2){
        int trapezoid = ((base1 + base2) * height) / 2;

        System.out.println("Trapezoid Area : " + trapezoid);
    }
    
        
    }

   
    
}

package com.ian.shape_calculator;

/**
 *
 * @author Ian Tagano
 */



public class Shape_Calculator 
{

    public static void main(String[] args) 
    {
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(1,2);
        Rectangle rectangle = new Rectangle(19, 23);
        
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
    
}

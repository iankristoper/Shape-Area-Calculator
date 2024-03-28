package com.ian.shape_calculator;

/**
 *
 * @author Ian Tagano
 */

public class Circle extends Shape
{
    //private data for circle
    private double radius;
    
    
    //constructor 
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    
    //getter
    @Override 
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    
    
}

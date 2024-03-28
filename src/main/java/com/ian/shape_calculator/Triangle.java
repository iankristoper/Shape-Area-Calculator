package com.ian.shape_calculator;

/**
 *
 * @author Ian Tagano
 */


public class Triangle extends Shape
{
    //private data for triangle
    private double base;
    private double height;
    
    
    //constructor 
    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    
    //getter
    @Override
    public double calculateArea()
    {
        return 0.5 * base * height;
    }
}

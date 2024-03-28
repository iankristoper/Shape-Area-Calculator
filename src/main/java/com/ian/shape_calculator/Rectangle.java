package com.ian.shape_calculator;

/**
 *
 * @author Ian Tagano
 */


public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    
    //constructor
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    
    //getter
    @Override
    public double calculateArea()
    {
        return length * width;
    }
}

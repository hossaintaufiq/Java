/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.lang.Math;
public class Circle {
    private double radius;
    private String color;
    private static int count;
    
    
    public Circle(){
        this.radius = 1;
        this.color = "Red";
        count++;
    }
    
    public Circle(double radius){
        this(radius,"red");
    }
    
    
    public Circle(double radius, String color){
        this.radius =radius;
        this.color = color;
        count++;
    }
    
    
    
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public void setRadius(double radius){
        this.radius =radius;
    }
    
    public boolean isEqual(Circle obj){
        return this.radius == obj.radius;
    }
    
    public static int getCount(){
        return count;
    }
    
    
}

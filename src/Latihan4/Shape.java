/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Farrel
 */
public class Shape {
    // Private member variabel
    private String color;
    // Constructor
    public Shape(String color){
        this.color=color;
    }
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    // All shapes must have a method called getArea().
    public double getArea(){
        // We nees to return some value to compile the program.
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktium;

/**
 *
 * @author Farrel
 */
public class subclassrect {
    public static int tambah(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect();
        System.out.println("<" + r1.isInside(2, 3)+ " > is inside the union"+"");
    Rect r3 = r1.union(r2);
        System.out.println("r1 union r2 = "+ r3.x1+", "+ r3.x2+ ", "+r3.y2);
    }
}

package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    
    public void draw(){
        System.out.println("Drawing Rectangle with width: " + width + " and height: " + height);
    }
    public double getArea() {
        return height * width;
    }
}

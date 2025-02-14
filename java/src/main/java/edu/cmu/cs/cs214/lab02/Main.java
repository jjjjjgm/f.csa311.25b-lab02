package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    //statis void main function
    public static void main(String[] args) {
        Renderer renderer = new Renderer();

        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(15);
        Shape square = new Square(4);

        renderer.render(rectangle);
        renderer.render(circle);
        renderer.render(square);
    }
    
}

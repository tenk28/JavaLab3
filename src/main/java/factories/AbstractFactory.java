package factories;

import circles.Circle;
import triangles.Triangle;

abstract public class AbstractFactory {
    public enum Colors {WHITE, BLACK}

    abstract public Circle createCircle();
    abstract public Triangle createTriangle();

    public static AbstractFactory getFactory(Colors color) {
        switch (color) {
            case WHITE:
                return new WhiteFactory();
            case BLACK:
                return new BlackFactory();
            default:
                System.out.println("Wrong color");
                return null;
        }
    }
}

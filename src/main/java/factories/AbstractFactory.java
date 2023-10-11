package factories;

import circles.Circle;
import triangles.Triangle;

public interface AbstractFactory {
    public Circle createCircle();
    public Triangle createTriangle();
}
package factories;

import circles.Circle;
import triangles.Triangle;

/**
 * Hello world!
 *
 */
public interface AbstractFactory {
    public Circle createCircle();
    public Triangle createTriangle();
}
package factories;

import circles.BlackCircle;
import circles.Circle;
import triangles.BlackTriangle;
import triangles.Triangle;

public class BlackFactory implements AbstractFactory {
    @Override
    public Circle createCircle()
    {
        return new BlackCircle();
    }
    @Override
    public Triangle createTriangle()
    {
        return new BlackTriangle();
    }
}

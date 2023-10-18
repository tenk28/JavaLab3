package factories;

import circles.Circle;
import circles.WhiteCircle;
import triangles.Triangle;
import triangles.WhiteTriangle;

public class WhiteFactory extends AbstractFactory {
    @Override
    public Circle createCircle()
    {
        return new WhiteCircle();
    }
    @Override
    public Triangle createTriangle()
    {
        return new WhiteTriangle();
    }
}

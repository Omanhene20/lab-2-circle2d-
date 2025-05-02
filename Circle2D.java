 public class Circle2D {
    private Point2D center;
    private double radius;

    // No-argument constructor
    public Circle2D() {
        this.center = new Point2D();
        this.radius = 1.0;
    }

    // Constructor with parameters
    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + " centered at " + center;
    }
}

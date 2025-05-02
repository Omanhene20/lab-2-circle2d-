public class Point2D {
    private double x;
    private double y;

    // Constructor
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

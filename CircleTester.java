public class CircleTester {
    public static void main(String[] args) {
        // Create a Circle2D object using the no-argument constructor
        Circle2D circle1 = new Circle2D();
        System.out.println(circle1);

        // Create a Circle2D object using the two-argument constructor
        Point2D centerPoint = new Point2D(1, 1);
        Circle2D circle2 = new Circle2D(centerPoint, 10);
        System.out.println(circle2);
    }
}

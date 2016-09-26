/**
 * Created by vabouque on 26/09/2016.
 */
public class Point2D {

    private double x;
    private double y;

    public Point2D() {
        this(0,0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public double distance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx - dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

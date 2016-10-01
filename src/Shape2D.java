/**
 * Created by Valentin on 01/10/2016.
 */
public abstract class Shape2D extends Shape implements Translatable2D {
    private Point2D refPoint;

    public Shape2D() {
        this.refPoint = new Point2D();
    }

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    abstract double perimeter();

    public Point2D getRefPoint() {
        return this.refPoint;
    }

}

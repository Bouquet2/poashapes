/**
 * Created by Valentin on 01/10/2016.
 */
public abstract class Shape2D extends Shape implements Translatable2D {
    private Point2D refPoint;

    abstract double perimeter();

    public Point2D getRefPoint() {
        return this.refPoint;
    }

}

/**
 * Created by Valentin on 01/10/2016.
 */
public abstract class Shape3D extends Shape implements Translatable3D{
    private Point3D refPoint;

    public Shape3D() {
        this.refPoint = new Point3D();
    }

    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    public abstract double volume();

    public Point3D getRefPoint() {
        return this.refPoint;
    }
}

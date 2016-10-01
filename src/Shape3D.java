/**
 * Created by Valentin on 01/10/2016.
 */
public abstract class Shape3D extends Shape implements Translatable3D{
    private Point3D refPoint;

    public abstract double volume();

    public Point3D getRefPoint() {
        return this.refPoint;
    }
}

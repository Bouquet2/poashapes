/**
 * Created by Valentin on 01/10/2016.
 */
public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ( 4 * Math.PI * Math.pow(radius, 3) ) / 3;
    }

    @Override
    public double surface() {
        return 4 * Math.PI *  Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;

        Sphere sphere = (Sphere) o;

        return Double.compare(sphere.getRadius(), getRadius()) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}

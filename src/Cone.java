/**
 * Created by Valentin on 01/10/2016.
 */
public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone(double height, double raduis) {
        super();
        this.height = height;
        this.radius = raduis;
    }

    public Cone(Point3D refPoint, double height, double raduis) {
        super(refPoint);
        this.height = height;
        this.radius = raduis;
    }

    public double diameter() {
        return this.radius * 2;
    }

    public double volume() {
        return (1.0/3.0) * diameter() * this.height ;
    }

    public double lateralSurface() {
        return Math.PI * radius * height;
    }

    public double surface() {
        return lateralSurface() + (Math.PI * Math.pow(radius, 2)) ;
    }

    public double getHeight() {
        return height;
    }

    public double getRaduis() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cone)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.getHeight(), getHeight()) != 0) return false;
        return Double.compare(cone.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getHeight());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}

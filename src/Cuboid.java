/**
 * Created by Valentin on 01/10/2016.
 */
public class Cuboid extends Shape3D{

    double length;
    double width;
    double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cuboid(Point3D refPoint, double length, double width, double height) {
        super(refPoint);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double surface() {
        return 2*width*length + 2*length*height + 2*height*width;
    }

    @Override
    public double volume() {
        return 2*width*length + 2*length*height + 2*height*width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cuboid)) return false;

        Cuboid cuboid = (Cuboid) o;

        if (Double.compare(cuboid.getLength(), getLength()) != 0) return false;
        if (Double.compare(cuboid.getWidth(), getWidth()) != 0) return false;
        return Double.compare(cuboid.getHeight(), getHeight()) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getLength());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

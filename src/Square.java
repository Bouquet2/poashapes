/**
 * Created by Valentin on 01/10/2016.
 */
public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public Square(Point2D refPoint, double length) {
        super(refPoint, length, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}

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

    public Square(Point2D refPoint, double length, double width) throws RectangleException{
        super(refPoint, length, width);
        if(length != width) {
            throw new RectangleException("Nouveau Rectangle : La largeur doit être égal à la haute");
        }
    }

    public Square(double length, double width) throws RectangleException{
        super(length, width);
        if(length != width) {
            throw new RectangleException("Nouveau Rectangle : La largeur doit être égal à la haute");
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}

public class Line {
    
    Point p1;
    Point p2;

    public Line(Point x, Point y) {
        
        p1 = x;
        p2 = y;
    }

    public double size() {

        return p1.distance(p2);
    }

    public double slope() {

        return (p1.y - p2.y) / (p1.x - p2.x);
    }

    public double value() {

        return p1.y - (p1.x * slope());
    }

    public Point crossPoint(Line l) {

        double x = (value() - l.value()) / (l.slope() - slope());
        double y = slope() * x + value();

        return new Point(x, y);
    }
}

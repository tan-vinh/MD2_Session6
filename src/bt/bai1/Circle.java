package bt.bai1;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        System.out.println("radius: " + radius);
        return null;
    }

    public double S(){
        return 2 * 3.14 * this.radius;
    }
}

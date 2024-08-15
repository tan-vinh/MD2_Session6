package bt.bai1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        System.out.println("Cylinder Radius: " + super.getRadius());
        System.out.println("Cylinder Height: " + this.height);
        return null;
    }

    public double V() {
        return this.height * super.S();
    }
}

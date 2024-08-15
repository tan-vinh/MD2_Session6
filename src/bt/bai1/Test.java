package bt.bai1;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Cylinder cyl = new Cylinder(10, 20);

        System.out.println("Dien tich hinh tron " + c.S());
        System.out.println("The tich hinh tru " + cyl.V());
    }
}

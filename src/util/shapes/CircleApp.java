package util.shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input value = new Input();
        System.out.println("Please enter the radius");
        double radius = value.getDouble();
        Circle info = new Circle(radius);
        System.out.println(info);
    }
}

package util.shapes;

public class Circle {

        private double radius;
        private double circumference;
        private double area;
        public final double pi = 3.141;

        public Circle(double radi){
            radius = radi;
            circumference = 2 * pi * radius;
            area = pi * (radius * radius);
            System.out.println("Circumference: " + circumference);
            System.out.println("Area: " + area);
        }
    }
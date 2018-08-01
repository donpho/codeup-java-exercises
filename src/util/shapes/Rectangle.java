package util.shapes;

public class Rectangle {
    private int perimeter;
    private int area;
    private int length;
    private int width;

    public Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
         return this.area = length * width;
    }

    public int getPerimeter() {
        return this.perimeter = (2 * length) + (2 * width);
    }
}

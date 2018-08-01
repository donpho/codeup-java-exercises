package util.shapes;

public class Rectangle {
    private int perimeter;
    private int area;

    public int getArea(int length, int width) {
        this.area = length * width;
        return area;
    }

    public int getPerimeter(int length, int width) {
        this.perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
}

package util.shapes;

public class Rectangle extends Quadrilateral implements Measurable{
//    private int perimeter;
//    private int area;
//    private int length;
//    private int width;
//
//    public Rectangle(int length,int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//         return this.area = length * width;
//    }
//
//    public int getPerimeter() {
//        return this.perimeter = (2 * length) + (2 * width);
//    }

    /*   Abstract and Interface Exercise   */

    public Rectangle(double length, double width){
        super(length,width);
    }

    @Override
    public double getPerimeter(){
        return this.length * 2 + this.width *2;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public double setLength() {
        return this.getLength();
    }

    @Override
    public double setWidth() {
        return this.getWidth();
    }
}

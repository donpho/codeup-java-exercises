package util.shapes;

public class Square extends Quadrilateral {

//    private int side;
//
//    public Square(int side){
//        super(side,side);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//       return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return side * 4;
//    }

    /*   Abstract and Interface Exercise   */

    public Square(double side){
        super(side,side);
    }

    @Override
    public double setLength() {
        return this.getLength();
    }

    @Override
    public double setWidth() {
        return this.getWidth();
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }
}

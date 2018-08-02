package util.shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Square sq = new Square(3);
//        System.out.println(sq.getArea());
//        System.out.println(sq.getPerimeter());
//
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    Measurable myShape = new Rectangle(5,8);
    Measurable mySq = new Square(4);
    System.out.println(mySq.getPerimeter());

        System.out.println(mySq.getArea());

    }
}

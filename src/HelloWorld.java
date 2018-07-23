public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello");

        int myFavoriteNumber = 1004;
        String myString = "hello there";
        double number = 3.14;

//        System.out.println(number);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 4;
////        x = x + 5;
//        x+=5;
//        System.out.println(x);

//        int x = 3, y = 4;
////        y = y * x;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

    }
}

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Please enter a number");
//        int userNum = sc.nextInt();
//        System.out.println("Your number is " + userNum);

//        System.out.println("Please enter 3 words.");
//        System.out.print("Enter the first word: ");
//        String firstWord = sc.nextLine();
//        System.out.println("First Word: " +  firstWord);
//
//        System.out.print("Enter the second word: ");
//        String secondWord = sc.nextLine();
//        System.out.println("Second Word: " +  secondWord);
//
//        System.out.print("Enter the third word: ");
//        String thirdWord = sc.nextLine();
//        System.out.println("Third Word: " +  thirdWord);

        System.out.print("Please enter the length of the room ");
        double length = sc.nextDouble();
        System.out.print("Now please enter the width of the room ");
        double width = sc.nextDouble();
        System.out.println("The area of the room is: " + length * width);
        System.out.println("The perimeter of the room is: " + ( 2 * width + 2 * length) );
        System.out.print("Please enter the height of the room");
        double height = sc.nextDouble();
        System.out.println("The height of the room is: " + length * width * height);


    }
}

import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
//        System.out.println(addition(1,2));
//        System.out.println(subtraction(3,4));
//        System.out.println(multiplication(5,6));
//        System.out.println(division(7,8));
//        System.out.println(recursion(6,5));
//        fact((long) (getIntegers(10,10)));
        dice();


    }

    public static double addition(double num1, double num2){
        return num1+num2;
    }

    public static double subtraction(double num1, double num2){
        return num1-num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double division(double num1, double num2){
        return num1/num2;
    }

    public static double recursion(double num1, double num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
            return num1 + recursion(num1, num2 - 1);
    }

    public static int getIntegers(int min,int max){
        if( (min > 1 && min <= max) ){
           return min;
        }
        System.out.println("Please enter a valid minimum");
        min = sc.nextInt();
        return min;
    }

    public static void fact(long num){
        String start = " :    1   x   ";
        int total = 1;
        System.out.println("1!"+ start + "=   1");
        for(int i = 2; i<=num; i++){
            start += i;
            total *= i;
            System.out.println(i+"!"+start+ "   =   " + total);
            start += "   x   ";
        }
    }

    public static void dice(){
        boolean playAgain = true;
        do {
            System.out.println("Please enter the amount of sides for the dice");
            int sides = sc.nextInt();
            int dice1 = rand.nextInt(sides) + 1;
            int dice2 = rand.nextInt(sides) + 1;
            System.out.printf("Dice 1: %d \nDice 2: %d", dice1, dice2);
            System.out.println("Play again? y/n");
            String exit = sc.next();
            if(exit.equalsIgnoreCase("n")){
                playAgain = false;
            }
        }while(playAgain);
    }
}

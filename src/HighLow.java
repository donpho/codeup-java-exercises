import java.util.Random;
import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        game();
    }

    public static void game(){
        int guessMe = rand.nextInt(100)+1;
        boolean play = true;
        int count = 0;
        System.out.println("I picked a number between 1 and 100.\nCan you guess it?\nYou have only 10 tries!");
        do{
            int guess = sc.nextInt();
            if(guess == guessMe){
                System.out.println("GOOD GUESS!");
                play = playAgain();
            }
            else if(count == 10){
                System.out.println("Sorry you've ran out of guesses!");
                play = playAgain();
            }
            else if(guess > guessMe){
                count ++;
                System.out.println("LOWER");
            }
            else if(guess < guessMe){
                count ++;
                System.out.println("HIGHER");
            }
            else{
                System.out.println("Sorry that is not a number!");
                game();
                play = playAgain();
            }
        }while(play);
    }

    public static boolean playAgain(){
        System.out.println("Do you want to play again? y/n");
        String exit = sc.next();
        if(exit.equalsIgnoreCase("y")){
            game();
            return true;
        }
        return false;
    }
}

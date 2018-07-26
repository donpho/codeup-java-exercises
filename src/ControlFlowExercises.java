import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 5;

        while ( i<= 15 ){
            System.out.println(i);
            i++;
        }

        long count = 1;
        do{
            if(count % 3 == 0 && count % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(count % 3 == 0){
                System.out.println("Fizz");
            }
            else if(count % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(count);
            }

            count ++;
        }
        while(count <= 100);

//        int x = 2;
//        do{
//            System.out.println(x);
//            x*=x;
//        }
//        while(x<1000000);

        System.out.print("What number would you like to go up to?");
        int input = sc.nextInt();
        System.out.println("Number  |  Square  |  Cubed  ");
        System.out.println("_____________________________");
        for (i = 1; i <= input; i++){
            System.out.printf(" %d    |   %d    |   %d   | \n", i, i*i, i*i*i);
            if(i == input){
                System.out.println("Do you want to Continue? Y/N ");
                String conti = sc.next();
                if(conti.equals("Y")|| conti.equals("y")){
                    i = 1;
                    System.out.print("What number would you like to go up to?");
                    input = sc.nextInt();
                }
            }
        }

        System.out.println("Do you want to enter your grade? (Y/N)");
        String answer = sc.next();
        if (answer.equals("Y")|| answer.equals("y")){
            System.out.println("Please enter your grade.");
            int grade = sc.nextInt();
            if(grade <= 100 && grade >= 88){
                System.out.println("You have an A!");
            }
            else if(grade < 88 && grade > 80){
                System.out.println("You have a B!");
            }
            else if(grade < 80 && grade > 67){
                System.out.println("You have a C!");
            }
            else if(grade < 67 && grade > 60){
                System.out.println("You have a D!");
            }
            else if(grade < 60 && grade >= 0){
                System.out.println("You have a F!");
            }
            else{
                System.out.println("That is not a valid grade!");
            }
        }
        else {
            System.out.println("Have a nice day!");
        }



    }
}

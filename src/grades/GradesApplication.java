package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {


    public static void main(String[] args) {
        showUsers();
    }

    public static void showUsers(){
        Input input = new Input();
        String userInput;

        HashMap<String, Student> students = new HashMap<>();
        students.put("fryevia00", new Student("Fryevia", 100, 95, 90));
        students.put("delit-him", new Student("Delita", 50, 40, 35));
        students.put("lassworm",new Student("Lasswell",50, 60, 80));

        System.out.println("Welcome!\n" +
                "Here is a list of all of our user!\n");
        for(String username : students.keySet()){
            System.out.print("|" + username + "|   ");
        }

        System.out.println("\n \n");

        System.out.println("What student would you like to see more information on?");
        userInput = input.getString().toLowerCase().trim();

        if(students.containsKey(userInput)){
            System.out.println("Name: " + students.get(userInput).getName() + " - Github Username: " + userInput);

            System.out.println( "Current Average: " + students.get(userInput).getGradeAverage());

        }
        else{
            System.out.println("Sorry, but we couldn't find the student with the github username of \"" + userInput + "\".");
        }

        System.out.println("Would you like to see another user?");
        if(input.yesNo()){
            showUsers();
        }
        else{
            System.out.println("Have a nice day!");
            System.exit(0);
        }


    }
}

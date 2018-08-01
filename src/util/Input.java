package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String answer = scanner.next().trim();
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }

    public int getInt(int min, int max){
        System.out.println("Please enter an integer between " + min + " and " + max + ".");
        int value = getInt();
        if (value < min || value > max){
            return getInt(min, max);
        }
        return value;
    }

    public int getInt(){
        int prompt = scanner.nextInt();
        return prompt;
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a number between " + min + " and " + max + ".");
        double value = getDouble();
        if (value < min || value > max){
            return getDouble(min, max);
        }
        return value;
    }

    public double getDouble(){
        double prompt = scanner.nextDouble();
        return prompt;
    }

}

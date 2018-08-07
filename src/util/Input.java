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

//    public int getInt(){
//        int value = scanner.nextInt();
//        return value;
//    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a number between " + min + " and " + max + ".");
        double value = getDouble();
        if (value < min || value > max){
            return getDouble(min, max);
        }
        return value;
    }

//    public double getDouble(){
//        double prompt = scanner.nextDouble();
//        return prompt;
//    }

    public int getInt(){
        while(true){
            String input = getString();
            try{
                Integer.valueOf(input);
                return Integer.valueOf(input);
            }
            catch (NumberFormatException e){
                System.out.println("Sorry but that is not a valid integer!\n" +
                        "Please try again!");
            }
        }
    }

    public double getDouble(){
        while(true){
            String input = getString();
            try{
                Double.valueOf(input);
                return Double.valueOf(input);
            }
            catch (NumberFormatException e){
                System.out.println("Sorry but that is not a valid number!\n" +
                        "Please try again!");
            }
        }
    }

    public int getBinary(){
        while(true){
            try {
                return Integer.parseInt(getString(),2);
            }
            catch (NumberFormatException e){
                System.out.println("Sorry but that is not a valid binary number!\n" +
                        "Please try again!");
            }
        }
    }

    public int getHex(){
        while(true){
            try {
                return Integer.parseInt(getString(),16);
            }
            catch (NumberFormatException e){
                System.out.println("Sorry but that is not a valid hexidecimal number!\n" +
                        "Please try again!");
            }
        }
    }

}

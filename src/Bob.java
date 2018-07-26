import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is Bob, try having a conversation with him");
        boolean checkout = true;
        do{
            String talk = sc.next();
            if(talk.endsWith("!")){
                System.out.println("Bob: Woah, chill out!");
            }
            else if(talk.endsWith("?")){
                System.out.println("Bob: Sure.");
            }
            else if(talk.equalsIgnoreCase("bob")){
                System.out.println("Bob: Fine be that way!");
            }
            else{
                System.out.println("Bob: Whatever");
            }
            System.out.println("Keep talking to Bob? y/n");
            String exit = sc.next();
            if(exit.equalsIgnoreCase("n")){
                checkout = false;
            }
        }while(checkout);
    }
}

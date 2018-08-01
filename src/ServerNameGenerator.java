import java.util.Random;
public class ServerNameGenerator {

    public static void main(String[] args) {
        nameGenerator();
    }

    public static void nameGenerator(){
        String[] adjectives = {"strange", "lucky", "awkward", "common", "speedy", "psycho", "innocent", "greedy","happy","relaxed"};
        String[] nouns = {"price", "eggs", "cream", "crayon", "scarecrow", "pan", "crook", "pencil", "shake", "juice"};
        Random rand = new Random();
        System.out.println("Here is your server name:");
        System.out.println(adjectives[rand.nextInt(adjectives.length)] + "-" + nouns[rand.nextInt(nouns.length)]);

    }

}

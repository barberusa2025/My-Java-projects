import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        // print random number between 1 and 6
        int randomNumber = random.nextInt(1, 7);
        System.out.println(randomNumber);
    }
}

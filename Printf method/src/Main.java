public class Main {

    public static void main(String[] args) {

        // printf() is used to format output

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a  %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f feet tall\n", height);
        System.out.printf("You are %s employed\n", isEmployed);
    }
}

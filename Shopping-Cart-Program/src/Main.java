import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of the item? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + "(s) " + item );
        System.out.println("Your total is: " + currency + total);


        scanner.close();
    }
}

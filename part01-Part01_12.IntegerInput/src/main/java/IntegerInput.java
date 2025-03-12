
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("You gave the number "+ number);
    }
}


import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" + //
                        "What is the main character called?");
        String input = scanner.nextLine();
        System.out.println("What is their job?");
        String input2 = scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was " + input + ", who was " + input2 + ".\nOn the way to work, "+ input + " reflected on life.\nPerhaps "+ input + " will not be "+ input2 +" forever.");

    }
}

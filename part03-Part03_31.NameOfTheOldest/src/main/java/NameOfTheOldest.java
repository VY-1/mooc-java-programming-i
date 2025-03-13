
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfOldest = "";
        while(true){
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.parseInt(parts[1]);
            String name = parts[0];
            if(age> oldestAge){
                oldestAge = age;
                nameOfOldest = name;

            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}

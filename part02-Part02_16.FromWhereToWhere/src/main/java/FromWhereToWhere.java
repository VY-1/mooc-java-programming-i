
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int upperLimit = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from?");
        int lowerLimit = Integer.parseInt(scanner.nextLine());

        for(int i=lowerLimit; i<=upperLimit; i++){
            System.out.println(i);
        }
    }
}

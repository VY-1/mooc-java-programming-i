
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        while(counter !=number){
            counter +=1;
            sum +=counter;
        }
        System.out.println("The sum is " + sum);

    }
}

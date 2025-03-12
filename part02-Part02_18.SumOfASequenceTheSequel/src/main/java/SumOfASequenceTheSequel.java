
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number? ");
        int last = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(first <=last){
            sum +=first;
            first++;
            
        }
        System.out.println("The sum is " + sum);

    }
}

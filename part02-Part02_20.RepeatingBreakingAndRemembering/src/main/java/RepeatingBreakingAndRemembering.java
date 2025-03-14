
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Give numbers:");
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                break;
            }
            if(number % 2 == 0){
                evenCount +=1;
            }else{
                oddCount +=1;
            }

            sum +=number;
            numCount +=1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " + (double)sum/numCount);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: "+ oddCount);
    }
}

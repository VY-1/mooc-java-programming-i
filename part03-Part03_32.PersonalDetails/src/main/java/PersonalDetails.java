
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longest = 0;
        double averageBirthYear = 0;
        int sumBirthYear = 0;
        int counter = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }

            String[] parts = input.split(",");
            if(parts[0].length()>longest){
                longest = parts[0].length();
                longestName = parts[0];
            }
            sumBirthYear += Integer.parseInt(parts[1]);
            counter +=1;

        }
        averageBirthYear = (double)sumBirthYear/counter;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);

    }
}


import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            //read a series of strings
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            //break the strings into array of words, separate words by space
            String[] pieces = input.split(" ");
            for(String word : pieces){
                System.out.println(word);
            }


        }


    }
}

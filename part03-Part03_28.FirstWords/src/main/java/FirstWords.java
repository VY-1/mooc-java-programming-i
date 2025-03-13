import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }

            //split input by spaces and store in words array
            String[] words = input.split(" ");
            System.out.println(words[0]);
        }
    }
}

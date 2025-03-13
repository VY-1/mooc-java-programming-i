import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            //break out the loop if input is empty
            if(input.equals("")){
                break;
            }

            //spliting string into array
            String[] parts = input.split(" ");
            for(String word: parts){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
        }
    }
    
}

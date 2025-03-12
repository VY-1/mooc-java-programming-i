import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                break;
            }
            list.add(number);

        }
        System.out.println("");
        
        System.out.print("Search for? ");
        int numToSearch = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == numToSearch){
                System.out.println(list.get(i) + " is at index " + i);
            }
        }
    }
}
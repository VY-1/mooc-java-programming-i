
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 9999){
                break;
            }
            list.add(number);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNumber = list.get(0);

        for(int number : list){
            if(number<smallestNumber){
                smallestNumber = number;
            }
        }
        System.out.println("Smallest number: " + smallestNumber);
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == smallestNumber){
                System.out.println("Found at index: " + i);
            }
        }

        
    }
}

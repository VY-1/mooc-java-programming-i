import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 0){
                break;
            }
            list.add(number);
        }
        //prints the sum of second and third element
        System.out.println(list.get(1)+list.get(2));
    }
}
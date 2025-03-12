import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            list.add(name);
        }
        //print the third element of the list
        System.out.println(list.get(2));
    }
}
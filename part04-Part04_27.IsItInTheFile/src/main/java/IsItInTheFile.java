
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //Read file and add to array list
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner contents = new Scanner(Paths.get(file))){
            while(contents.hasNextLine()){
                String row = contents.nextLine();
                list.add(row);
            }
        }catch(Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if(list.contains(searchedFor)){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }

    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if(id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if( name.isEmpty()){
                break;
            }
            Archive newArchive = new Archive(id, name);
            if(!archives.contains(newArchive)){
                archives.add(newArchive);

            }

        }
        System.out.println("==Items==");
        for(Archive archive: archives){
            System.out.println(archive);
        }



    }
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try(Scanner fileContent = new Scanner(Paths.get(file))){
            while(fileContent.hasNextLine()){
                String[] line = fileContent.nextLine().split(",");
                persons.add(new Person(line[0], Integer.valueOf(line[1])));

            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        return persons;

    }
}

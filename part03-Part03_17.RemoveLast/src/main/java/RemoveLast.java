
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

        ArrayList<String> stringList =  new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        System.out.println(stringList);

        removeLast(stringList);
        removeLast(stringList);
        System.out.println(stringList);
    }

    public static void removeLast(ArrayList<String> strings){
        if(strings.size() == 0){
            return;
        }
        int lastIndex = strings.size()-1;
        strings.remove(lastIndex);
    }

}

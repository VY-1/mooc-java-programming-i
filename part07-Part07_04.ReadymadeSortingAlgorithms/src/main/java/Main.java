import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(2,4,5,3, 9, 77, 32, 56, 11));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Joe", "Kevin", "Mike", "Andy", "Bill"));
        sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println();

        sortIntegers((numList));
        System.out.println((numList));

        sortStrings(stringList);
        System.out.println(stringList);


    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    //sort a list of integers
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    //sort a list of strings
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}

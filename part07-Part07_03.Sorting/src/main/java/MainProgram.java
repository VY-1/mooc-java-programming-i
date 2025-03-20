import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));

        System.out.println("Index of the smallest number: " +indexOfSmallest(array));
        System.out.println("Index of the smallest from starting index: " + indexOfSmallestFrom(array, 0));
        System.out.println("Index of the smallest from starting index: " + indexOfSmallestFrom(array, 1));
        System.out.println("Index of the smallest from starting index: " + indexOfSmallestFrom(array, 2));

        System.out.println();
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        sort(array);
        System.out.println();
        sort2(array);
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int num: array){
            if(num<smallest){
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int indexOfSmallest = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]< array[indexOfSmallest]){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallestIndexFrom = startIndex;
        for(int i = smallestIndexFrom; i<table.length; i++){
            if(table[i]<table[smallestIndexFrom]){
                smallestIndexFrom = i;
            }
        }
        return smallestIndexFrom;
    }

    public static void swap(int[] array, int index1, int index2){
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }

    public static void sort(int[] array){
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {
            
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }

    }

    //Sort using for loop
    public static void sort2(int[] array){
        
        System.out.println(Arrays.toString(array));
        for(int i = 0; i<array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));

        }
    }

}


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posNumCount = 0;
        int sumPosNum = 0;
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 0){
                break;
            }
            if(number<0){
                continue;
            }
            posNumCount +=1;
            sumPosNum +=number;
        }

        if(sumPosNum == 0){
            System.out.println("Coannot calculate the average");
        }else{
            System.out.println((double)sumPosNum/posNumCount);
        }

    }
}

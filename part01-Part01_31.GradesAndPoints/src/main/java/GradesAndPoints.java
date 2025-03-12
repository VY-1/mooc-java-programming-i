
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade = "";
        int points = Integer.parseInt(scan.nextLine());
        if (points > 100){
            grade = "incredible!";
        }else if(points>89){
            grade = "5";
        }else if(points>79){
            grade = "4";
        }else if(points>69){
            grade = "3";
        }else if(points>59){
            grade = "2";
        }else if(points>49){
            grade = "1";
        }else if(points>=0){
            grade = "failed";
        }else{
            grade = "impossible!";
        }

        System.out.println("Grade: "+ grade);
    }
}


import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tax = 0;
        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(scan.nextLine());

        if (amount >= 1000000){
            tax = (142100 + (amount-1000000)*0.17);
        }else if(amount >=200000){
            tax = (22100 + (amount-200000)*0.15);
        }else if(amount >= 55000){
            tax = (4700 + (amount-55000)*0.12);
        }else if(amount >=25000){
            tax = (1700 + (amount-25000)*0.1);
        }else if(amount >= 5000){
            tax = (100 + (amount-5000)*0.08);
        }else{
            tax = 0;
        }

        if (tax == 0){
            System.out.println("No tax!");
        }else{
            System.out.println("Tax: "+ tax);
        }

    }
}

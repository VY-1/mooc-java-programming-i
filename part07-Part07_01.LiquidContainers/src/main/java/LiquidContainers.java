
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxVol = 100;

        while (true) {
            System.out.println("First: " + first +"/" + maxVol);
            System.out.println("Second: " + second + "/" + maxVol);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }


            String[] parts= input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if(command.equals("add") && amount>0){
                first += amount;
                if(first>=maxVol){
                    first = maxVol;
                }
            }else if(command.equals("move") && amount >0){
                if((first -amount) >= 0){
                    second += amount;
                    first -= amount;
                    if(second >= maxVol){
                        second = maxVol;
                    }
                    
                }else if ((first - amount)<0){
                    second += first;
                    first = 0;
                    if(second >= maxVol){
                        second = maxVol;
                    }
                }
            }else if(command.equals("remove") && amount >=0){
                if((second - amount) >=0){
                    second -= amount;
                }else if((second - amount) < 0){
                    second = 0;
                }
            }

        }
    }

}

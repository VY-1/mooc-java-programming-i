
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        try(Scanner fileContents = new Scanner(Paths.get(file))){
            System.out.println("Team:");
            String team = scan.nextLine();
            int gameCount = 0;
            int win = 0;
            int lose = 0;
            while(fileContents.hasNextLine()){
                String[] line = fileContents.nextLine().split(",");
                if(line[0].equals(team) || line[1].equals(team)){
                    gameCount +=1;
                    if((line[0].equals(team) && Integer.parseInt(line[2])> Integer.parseInt(line[3])) || (line[1].equals(team)&& Integer.parseInt(line[3])> Integer.parseInt(line[2]))){
                        win +=1;
                    }else{
                        lose +=1;
                    }
                }
                

            }
            System.out.println("Games: "+ gameCount);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        }catch(Exception e){

        }

    }

}

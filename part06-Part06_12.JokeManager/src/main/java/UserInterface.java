import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start(){
        
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String userInput = scanner.nextLine();
            if(userInput.equals("X")){
                break;
            }

            processCommand(userInput);

        }
    }

    public void processCommand(String userInput){
        if(userInput.equals("1")){
            add();
        }
        if(userInput.equals("2")){
            drawJoke();
        }
        if(userInput.equals("3")){
            listJokes();
        }

    }

    private void add(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);

    }

    private void drawJoke(){
        System.out.println("Drawing joke.");
        System.out.println(this.jokeManager.drawJoke());
    }
    
    private void listJokes(){
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }
}

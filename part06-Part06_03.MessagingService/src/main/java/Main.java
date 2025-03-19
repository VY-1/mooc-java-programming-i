import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Scanner scanner = new Scanner(System.in);

        MessagingService messagingService = new MessagingService();

        while(true){
            System.out.println("Sender:");
            String sender = scanner.nextLine();
            if(sender.isEmpty()){
                break;
            }
            System.out.println("Contents:");
            String contents = scanner.nextLine();

            Message newMessage = new Message(sender, contents);
            if(!messagingService.getMessages().contains(newMessage)){
                messagingService.add(newMessage);
            }
        }

        for(Message message: messagingService.getMessages()){
            System.out.println(message);
        }

    }
}

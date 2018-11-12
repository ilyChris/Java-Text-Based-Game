import java.util.Scanner;
import java.util.Random;

public class GameSetUp extends Main{
    Scanner playerInput = new Scanner(System.in);

    public static int batmanHP = 100;
    public static String batmanSuit = "Normal";
    public int option;
    public String playerVerbInput;
    public static int jokerHP = 100;

    public static boolean upgradedSuit = false ;
    public static boolean batarang = false ;
    public static boolean westRoomLock = false ;

    public void GameSetUp (){

        System.out.println("You are Batman sitting in the BatCave.\n"+"You have equipped the "+batmanSuit+" batsuit\n"+
                "You see that the Bat Signal has been activated.\n"+
                        "What do you want to do?");
        System.out.println("1) Respond to the Bat Signal.\n"+
                "2) Ignore it and go back to brooding.");

        option = playerInput.nextInt();

        if(option == 1){
            System.out.println(" You jump into the Batmobile and head to the Gotham City Police Department.");
            System.out.println("Your HP is:" + batmanHP);
            GCPDEntrance goToGCPD = new GCPDEntrance();
            goToGCPD.GCPDEntrance();

        }
        else if(option == 2){
            System.out.println(" You decide to not deal with justice today however you start to feel bad about this choice and start to reconsider.");
            GameSetUp();
        }
        else{
            GameSetUp();
        }

    }
}

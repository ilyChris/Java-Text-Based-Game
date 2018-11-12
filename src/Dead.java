public class Dead {
    public void loseGame(boolean choice){
        if(choice == true) {
            System.out.println("Joker finishes you off with his knife and kills Jim Gordon");
            System.out.println("Next time maybe look for an armour upgrade");
            System.out.println("YOU LOSE");
        }
        else if(choice == false){
            System.out.println("The explosion kills you as you failed to jump out of the way");
            System.out.println("YOU LOSE");
        }
    }
}

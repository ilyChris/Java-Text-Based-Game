public class WestGCPD extends GCPDCorridor{
    public void fightJoker(){
        System.out.println("You enter the room and see Joker standing behind Jim Gordon who is tied to a chair");
        System.out.println("What do you do?");
        System.out.println("1) Fight Joker");
        System.out.println("2) Leave room");


        option = playerInput.nextInt();

        if(option == 1){
            JokerFight boss = new JokerFight();
            boss.jokerFight();
        }
        else if(option == 2){
            GCPDCorridor();
        }
        else{
            fightJoker();
        }
    }
}

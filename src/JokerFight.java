public class JokerFight extends WestGCPD{
    public void jokerFight(){
        System.out.println("Batman HP: "+ batmanHP);
        System.out.println("Joker HP: "+ jokerHP);

        System.out.println("1) Punch");
        System.out.println("2) Flee");

        option = playerInput.nextInt();
        if(option == 1){
            FightMechanics fight = new FightMechanics();
            fight.fistFight();
        }
        else if(option == 2){
            GCPDCorridor();
        }
        else{
            jokerFight();
        }
    }
}

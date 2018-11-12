public class GCPDCorridor extends GCPDEntrance{

    public void GCPDCorridor(){
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Which way would you like to go?");
        System.out.println("north");
        System.out.println("east");
        System.out.println("south");
        System.out.println("west");
        System.out.println("Enter a direction of movement");

        playerVerbInput = playerInput.nextLine();

        /* ATTEMPTED TO MAKE BOOLEAN STATEMENTS WHICH WOULD PREVENT ACCESS TO THE WEST ROOM DEPENDING ON IF
        THE PLAYER HAD FOUND AND USED BATARANGS ON THE LOCK FOR THE ROOM. I COULD NOT GET IT TO WORK.
         */

        if(playerVerbInput.equals("north")){
            if(GameSetUp.upgradedSuit){
                System.out.println("You have no reason to go back in this room");
                GCPDCorridor();
            }
            else {
                NorthGCPD getBatsuit = new NorthGCPD();
                getBatsuit.puzzle();
            }

        }
        else if(playerVerbInput.equals("east")){
            if(GameSetUp.westRoomLock){
                System.out.println("You have done all there is to do in this room");
                GCPDCorridor();
            }
            else {
                EastGCPD unlockBoss = new EastGCPD();
                unlockBoss.unlockWest();
            }

        }
        else if(playerVerbInput.equals("south")){
            if(GameSetUp.batarang){
                System.out.println("You have no reason to go back here");
                GCPDCorridor();
            }
            else {
                SouthGCPD getBatarang = new SouthGCPD();
                getBatarang.acquireBatarangs();
            }


        }
        else if(playerVerbInput.equals("west")){
            if(GameSetUp.westRoomLock){
                System.out.println("You can hear the Joker laughing from outside the room");
                System.out.println("The door is unlocked and you enter the room");
                WestGCPD bossFight = new WestGCPD();
                bossFight.fightJoker();
            }
            else{
                System.out.println("You can hear the Joker laughing from outside the room");
                System.out.println("The door is locked and you can't seem to enter");
                System.out.println("You need to find a way into this room fast before Joker kills Jim");
                GCPDCorridor();
            }

        }
        else {
            GCPDCorridor();
        }


    }
}

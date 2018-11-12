public class EastGCPD extends GCPDCorridor {
    public void unlockWest(){
        System.out.println("You see a glass box on the wall containing the switch to unlock the west room");
        System.out.println("What do you do?");
        System.out.println("1) Break the glass");
        System.out.println("2) Leave room");

        option = playerInput.nextInt();

        if(option == 1){
            if(GameSetUp.batarang){

                GameSetUp.westRoomLock = true;
                System.out.println("You use a batarang to smash the glass box and unlock the west room");
                System.out.println("You exit the room");
                GCPDCorridor();
            }
            else {
                System.out.println("You cannot smash this glass with your barehands.");
                System.out.println("You need to find some batarangs");
                System.out.println("You leave the room");
                GCPDCorridor();
            }

        }
        else if(option == 2){
            System.out.println("You exit the room");
            GCPDCorridor();
        }
        else {
            unlockWest();
        }
    }
}

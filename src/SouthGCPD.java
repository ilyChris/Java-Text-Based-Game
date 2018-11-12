public class SouthGCPD extends GCPDCorridor{
    //boolean batarang;
    public void acquireBatarangs(){
        System.out.println("You enter the armoury");
        System.out.println("You can see some batarangs on the floor");
        System.out.println("What would you like to do?");
        System.out.println("1) Pick up the batarangs");
        System.out.println("2) Leave room");

        option = playerInput.nextInt();

        if(option==1){
            System.out.println("You walk over towards the batarangs and add them to your toolbelt");
            GameSetUp.batarang = true;
            System.out.println("You now leave the room");
            GCPDCorridor();
        }
        else if(option == 2){
            System.out.println("You now leave the room");
            GCPDCorridor();
        }
        else{
            acquireBatarangs();
        }

    }
}

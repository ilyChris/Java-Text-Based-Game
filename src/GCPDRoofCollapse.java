public class GCPDRoofCollapse extends GCPDEntrance{
    public void GCPDRoofCollapse (){
        System.out.println("IT'S A TRAP!\n" +
                "This is not the real Jim Gordon. It's a mannequin with a drawn-on Joker smile with bombs strapped on it.");
        System.out.println(" Maybe you should 'jump' out of the way");
        playerVerbInput = playerInput.nextLine();

        if(playerVerbInput.equals("jump") || playerVerbInput.equals("Jump")){
            System.out.println("You jump backwards and dodge the blast.\n" +
                    "However, the rooftop collapses and you fall inside the building.\n" +
                    "You awaken on the floor of the GCPD very disorientated.\n"+
                    "As your eyes start to focus you see there are four ways in which you can move:");
            GCPDCorridor corridor = new GCPDCorridor();
            corridor.GCPDCorridor();
        }
        else{
            Dead lose = new Dead();
            lose.loseGame(false);

        }

    }
}

public class GCPDEntrance extends GameSetUp{
    public void GCPDEntrance (){
        System.out.println("You arrive at the GCPD and grapple your way to the rooftop where the Batsignal is located\n"+
                "You see a shadowed figure standing on the rooftop.");
        System.out.println("1) Approach the figure.");
        option = playerInput.nextInt();
        if(option == 1){
            System.out.println("Moving closer you notice it's Jim Gordon.\n" +
                    "However, the closer you get you start to notice something is strange.");
            GCPDRoofCollapse roofGCPD = new GCPDRoofCollapse();
            roofGCPD.GCPDRoofCollapse();
        }
        else{
            GCPDEntrance();
        }
    }
}

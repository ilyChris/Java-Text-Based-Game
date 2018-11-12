public class NorthGCPD extends GCPDCorridor{
    public void puzzle(){
        System.out.println("You go north and enter a room which has a locked glass case.\n" +
                "Examining the case you see there is an upgraded Batsuit inside.\n" +
                "The display case is locked by an electronic lock");
        System.out.println("What would you like to do?");
        System.out.println("1) Hack the lock");
        System.out.println("2) Leave room");

        option = playerInput.nextInt();
        if(option == 1){
            electronicLock();

            //setUpgradedSuit();
            System.out.println("You have upgraded your batsuit");
            batmanSuit = "Armoured";
            GameSetUp.batmanHP += 200;
            System.out.println("You now have equipped the "+batmanSuit+" batsuit");
            System.out.println("You now leave the room");
            GCPDCorridor();

        }
        else if (option == 2){
            System.out.println("You now leave the room");
            GCPDCorridor();
        }
        else{
            puzzle();
        }
    }

    public void electronicLock(){
        String puzzle = "Okjer Joker Rekoj Erjok Jekor";
        String solution = "Joker";
        boolean solved = false;
        while(solved != true){
            System.out.println("Solve the following puzzle by entering the correct Batman villain from the options");
            System.out.println(puzzle);
            String playerSolution = playerInput.nextLine();
            solved = solution.equals(playerSolution) ? true:false;
            if(solved == false){System.out.println("Incorrect solution, try again");}
        }
;
    }
}

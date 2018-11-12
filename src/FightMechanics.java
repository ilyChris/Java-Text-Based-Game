import java.util.Random;

public class FightMechanics extends JokerFight{

    /*
    FIGHTING DOES NOT QUITE WORK PROPERLY AND JOKER IS DEFEATED IN ONE HIT
     */
    public void fistFight(){

        int batmanDamage = 0;

        batmanDamage = new Random().nextInt(150);

        System.out.println("You punched Joker and dealt "+ batmanDamage+" damage");
        jokerHP -= batmanDamage;
        System.out.println("Joker HP: "+jokerHP );

        if(jokerHP<1){
            Win victory = new Win();
            victory.winGame();
        }
        else if(jokerHP > 0){
            int jokerDamage = 0;
            jokerDamage = new Random().nextInt(75);
            System.out.println("Joker slashed at you with his knife and dealt "+ jokerDamage+" damage");
            batmanHP -= jokerDamage;
            System.out.println("Batman HP: "+ batmanHP);

            if(batmanHP < 1){
                Dead lose = new Dead();
                lose.loseGame(true);
            }
            else if(batmanHP > 0){
                jokerFight();
            }
        }
    }
}

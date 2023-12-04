package upei.project;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import upei.project.Actions;
import upei.project .Dice;
import upei.project.NewBox;



public class MainTest {

    Actions actions = new Actions();

    Strategy strategy1 = new Strategy(true,  true, false,false,false, true,true,true,false,true,false);
    Player player1 = new Player("Ayo",1, 1500, strategy1);

    NewBox boxx = new LandBox("St Charles Place",12,player1,100,200,"pink");

    NewBox box = new NoActions("Go to Jail",31);

    ChanceCard chance = new ChanceCard("Advance to wateer works",29);

    private void assertTrue(String s, int currentPosition){

    }




    //Also tests the rollDiceAndPrintTotal method
    @Test
    public void testPlayerMovement() {
        actions.moveForward(player1);
        assertEquals(1 , player1.getCurrentPosition());
    }


    //Also tests the getCurrentPosition method
    @Test
    public void testGoToJailmethod(){
        actions.GoToJail(player1,box);
        assertEquals( 31,player1.getCurrentPosition());
    }
    @Test
    public void testAdvanceTo(){
        actions.advanceTo(player1,chance);
        assertEquals(29,player1.getCurrentPosition());
    }
    @Test
    public void testGetOwnedBy(){
        assertEquals(player1,boxx.getOwnedBy());
    }
    @Test
    public void testSetOwnedBy(){
        boxx.setOwnedBy(player1);
        assertEquals(player1.playerName,player1.playerName);

    }

    @Test
    public boolean testPurchaseMethod(){
        assertEquals(true, player1.makePurchase(200));
        return player1.makePurchase(200);
    }

    @Test
    public void testacceptMoney(){
        player1.acceptMoney(100);
        assertEquals( 1600,player1.currentMoney);
    }
    @Test
    public void testPayRent(){
        player1.payRent(100);
        assertEquals(1400,player1.currentMoney);
    }





}

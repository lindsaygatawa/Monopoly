package upei.project;
//import java.util.ArrayList;
import java.util.Random;


public class Actions {
    public NewBox[] newBoxes;

    int total;



    public Actions () {
        newBoxes = new NewBox[40];
        createBoxes();

    }



    //method to create the boxes
    public void createBoxes(){



        newBoxes[0] = new NoActions("Go",1);
        newBoxes[1] = new LandBox("Mediterranean Avenue",2,null,50,60, "Brown");
        newBoxes[2] = new CummunityBox("Community Chest",3);
        newBoxes[3] = new LandBox("Baltic Avenue",4,null,60,90,"Brown");
        newBoxes[4] = new NoActions("Income Tax",5, 0);
        newBoxes[5] = new Utility("Railroad",6,null,200,200);
        newBoxes[6] = new LandBox("Oriental Avenue",7,null,100,120,"Light Blue");
        newBoxes[7] = new ChanceBox("Chance",8);
        newBoxes[8] = new LandBox("Vermont Avenue",9,null,100,130,"Light Blue");
        newBoxes[9] = new LandBox("Connecticut Avenue",10,null,120,250, "Light Blue");
        newBoxes[10] = new NoActions("Jail",11);
        newBoxes[11] = new LandBox("St. Charles Place",12,null,140,140,"Pink");
        newBoxes[12] = new Utility("Electric company",13,null,150,140);
        newBoxes[13] = new LandBox("States ave",14,null,140,140,"Pink");
        newBoxes[14] = new LandBox("Virgina ave",15,null,160,140,"Pink");
        newBoxes[15] = new Utility("Railroad",16,null,200,140);
        newBoxes[16] = new LandBox("St. James Place",17,null,180,140,"Orange");
        newBoxes[17] = new CummunityBox("Community chest",18);
        newBoxes[18] = new LandBox("Tennessee ave",19,null,180,140,"Orange");
        newBoxes[19] = new LandBox("New York ave",20,null,200,140,"Orange");
        newBoxes[20] = new NoActions("Free parking",21);
        newBoxes[21] = new LandBox("Kenturkey ave",22,null,220,140,"Red");
        newBoxes[22] = new ChanceBox("Chance",23);
        newBoxes[23] = new LandBox("Indiana ave",24,null,220,140,"Red");
        newBoxes[24] = new LandBox("Illinois ave",25,null,240,140,"Red");
        newBoxes[25] = new Utility("Railroad",26,null,200,140);
        newBoxes[26] = new LandBox("Atlantic ave",27,null,260,140,"Yellow");
        newBoxes[27] = new LandBox("Ventnor ave",28,null,260,140,"Yellow");
        newBoxes[28] = new Utility("Water work",29,null,150,140);
        newBoxes[29] = new LandBox("Mavin gardens",30,null,280,140,"Yellow");
        newBoxes[30] = new NoActions("Go to Jail",31);
        newBoxes[31] = new LandBox("Pacific ave",32,null,300,140,"Green");
        newBoxes[32] = new LandBox("North Carolina ave",33,null,300,140,"Green");
        newBoxes[33] = new CummunityBox("Community chest",34);
        newBoxes[34] = new LandBox("Pennsylvania ave",35,null,320,140,"Green");
        newBoxes[35] = new Utility("Railroad",36,null,200,140);
        newBoxes[36] = new ChanceBox("Chance",37);
        newBoxes[37] = new LandBox("Park place",38,null,350,140,"Dark Blue");
        newBoxes[38] = new NoActions("Luxury tax",39,0);
        newBoxes[39] = new LandBox("Board walk",40,null,400,140,"Dark Blue");


    }
    // Go to jail method
    public void GoToJail(Player currentPlayer,NewBox box){
        currentPlayer.currentPosition = box.boxId;

    }
    public void advanceTo(Player currentPlayer, ChanceCard chanceCard){
        currentPlayer.currentPosition = chanceCard.boxId;
    }

    public void advanceTo(Player currentPlayer, CommunityChestCard chanceCard){
        currentPlayer.currentPosition = chanceCard.boxID;
    }
    //roll dice method

    public int rollDiceAndPrintTotal(){
        Dice dice = new Dice();
        dice.roll();
        total = dice.getTotal();
        return total;


    }

    // updates player position and gives player $200 if they land on Go or if they pass GO
    public int  moveForward(Player player){
        int steps = player.currentPosition + total;
        if(steps >= 40) {
            player.currentPosition = steps % 40;
            player.acceptMoney(200);
        }
        else{
            player.currentPosition = steps;

        }
        return player.getCurrentPosition();



    }

    
}
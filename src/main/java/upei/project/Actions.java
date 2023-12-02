package upei.project;
//import java.util.ArrayList;
import java.util.Random;


public class Actions {
    public NewBox[] newBoxes;

    public Actions () {
        newBoxes = new NewBox[40];

    }


    //method to create the boxes
    public void createBoxes(){



        newBoxes[0] = new Box("Go",1);
        newBoxes[1] = new LandBox("Mediterranean Avenue",2,50,60, "Brown");
        newBoxes[2] = new Box("Community Chest",3,0,0,0);
        newBoxes[3] = new LandBox("Baltic Avenue",4,0,90,"Brown");
        newBoxes[4] = new Box("Income Tax",5,0,0,150);
        newBoxes[5] = new Box("Reading Railroad",6,0,200/);
        newBoxes[6] = new LandBox("Oriental Avenue",7,0,120,"Light Blue");
        newBoxes[7] = new ChanceBox("Chance",8);
        newBoxes[8] = new LandBox("Vermont Avenue",9,0,130,"Light Blue");
        newBoxes[9] = new LandBox("Connecticut Avenue",10,0,250, "Light Blue");
        newBoxes[10] = new Box("Jail / Just Visiting",11,0,0,);
        newBoxes[11] = new LandBox("St. Charles Place",12,0,140,"Pink");
        newBoxes[12] = new Box("Electric company",13,0,140,"");
        newBoxes[13] = new LandBox("States ave",14,0,140,"Pink");
        newBoxes[14] = new LandBox("Virgina ave",15,0,140,"Pink");
        newBoxes[15] = new Box("Pennsylvania rail road",16,0,140,"");
        newBoxes[16] = new LandBox("St. James Place",17,0,140,"Orange");
        newBoxes[17] = new Box("Community chest",18,0,140,"");
        newBoxes[18] = new LandBox("Tennessee ave",19,0,140,"Orange");
        newBoxes[19] = new LandBox("New York ave",20,0,140,"Orange");
        newBoxes[20] = new Box("Free parking",21,0,140,"");
        newBoxes[21] = new LandBox("Kenturkey ave",22,0,140,"Red");
        newBoxes[22] = new Box("Chance",23,0,140,"");
        newBoxes[23] = new LandBox("Indiana ave",24,0,140,"Red");
        newBoxes[24] = new LandBox("Illinois ave",25,0,140,"Red");
        newBoxes[25] = new Box("B & O Railroad",26,0,140,"");
        newBoxes[26] = new LandBox("Atlantic ave",27,0,140,"Yellow");
        newBoxes[27] = new LandBox("Ventnor ave",28,0,140,"Yellow");
        newBoxes[28] = new Box("Water work",29,0,140,"");
        newBoxes[29] = new LandBox("Mavin gardens",30,0,140,"Yellow");
        newBoxes[30] = new Box("Go to Jail",31,0,140,"");
        newBoxes[31] = new LandBox("Pacific ave",32,0,140,"Green");
        newBoxes[32] = new LandBox("North Carolina ave",33,0,140,"Green");
        newBoxes[33] = new Box("Community chest",34,0,140,"");
        newBoxes[34] = new LandBox("Pennsylvania ave",35,0,140,"Green");
        newBoxes[35] = new Box("Short line Railroad",36,0,140,"");
        newBoxes[36] = new Box("Chance",37,0,140,"");
        newBoxes[37] = new LandBox("Park place",38,0,140,"Dark Blue");
        newBoxes[38] = new Box("Luxury tax",39,0,140,"");
        newBoxes[39] = new LandBox("Board walk",40,0,140,"Dark Blue");


    }
    // Go to jail method
    public void GoToJail(Player currentPlayer){
        currentPlayer.currentPosition =

    }
}
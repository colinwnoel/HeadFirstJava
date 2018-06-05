package Chapter5;

public class Dice {


    public int rollDice(){
        return (int)(Math.random()*6+1);

    }



    public int enhancedRollDice(){
        int[] myDie = new int[]{1,2,3,4,5,6};
        int myPick = myDie[(int)(Math.random()* 6)];
        return myPick;
    }
}

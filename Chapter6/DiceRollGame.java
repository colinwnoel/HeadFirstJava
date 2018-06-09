package Chapter6;


import java.util.ArrayList;

public class DiceRollGame {


    public static void main(String[] args) {
        DiceRollGame myGame = new DiceRollGame();
        Dice myDice1 = new Dice();

        myGame.determineWinner(myDice1);



    }

    public void determineWinner(Dice aDice){

        //Creating an ArrayList of ValueOccurrances - 6 of them, one for each possible value of a die roll
        ArrayList<ValueOccurrance> listOccurrance = new ArrayList<>();
        for (int index = 1; index < 7; index++) {
            listOccurrance.add(new ValueOccurrance(index, 0));
        }
        //5 Dice in a roll we'll start at 5 and go down from there
        int numOfDice = 5;
        while (numOfDice > 0) {
            //Get a random value and assign
            int randomValue = aDice.enhancedRollDice();
            //Get the value we want to increment and use setValue which increases the count by 1
            ValueOccurrance myOccur = listOccurrance.get(randomValue - 1);
            myOccur.setValue();
            System.out.println("We rolled a " + randomValue);
            numOfDice--;
        }
        System.out.println();
        // need some variables to keep track of how many of each winning roll we have
        int numPairs = 0;
        int numThrees = 0;
        int numFours = 0;
        for (ValueOccurrance diceRoll : listOccurrance) {
            if (diceRoll.getOcc() > 0) {
                if (diceRoll.getOcc() == 2) {
                    System.out.println("We have a pair of " + diceRoll.getValue() + "'s");
                    numPairs++;
                }
                if (diceRoll.getOcc() == 3) {
                    System.out.println("We have three " + diceRoll.getValue() + "'s");
                    numThrees++;
                }
                if (diceRoll.getOcc() == 4) {
                    System.out.println("We have four " + diceRoll.getValue() + "'s");
                    numFours++;
                }
                if (diceRoll.getOcc() == 5) {
                    System.out.println("We have Yahtzee!!! 5 " + diceRoll.getValue() + "'s");
                }
            }
        }
        //handling pairs
        if (numPairs > 1) {
            System.out.println("two pair");
            //handling a full house - 1 pair 1 three of a kind
        }else if (numPairs == 1 && numThrees == 1) {
            System.out.println("full house");
        }
        //handling 4 of a kind
        if (numFours == 1) {
            System.out.println("four of a kind");
        }
        //handling 3 of a kind
        if (numThrees == 1) {
            System.out.println("three of a kind");
        }

    }


}










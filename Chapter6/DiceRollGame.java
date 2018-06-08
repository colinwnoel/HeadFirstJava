package Chapter6;


import java.util.ArrayList;

public class DiceRollGame {


    public static void main(String[] args) {
        DiceRollGame myGame = new DiceRollGame();
        Dice myDice1 = new Dice();

        myGame.determineWinner(myDice1);



    }

    public void determineWinner(Dice aDice){
        ArrayList<ValueOccurrance> listOccurrance = new ArrayList<>();
        for (int index = 1; index < 7; index++) {
            listOccurrance.add(new ValueOccurrance(index, 0));
        }
        int numOfDice = 5;
        while (numOfDice > 0) {
            int randomValue = aDice.enhancedRollDice();
            ValueOccurrance myOccur = listOccurrance.get(randomValue - 1);
            myOccur.setValue();
            System.out.println("We rolled a " + randomValue);
            numOfDice--;
        }
        System.out.println();
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
        if (numPairs > 1) {
            System.out.println("two pair");
        }

        if (numPairs == 1 && numThrees == 1) {
            System.out.println("full house");
        }

        if (numFours == 1) {
            System.out.println("four of a kind");
        }

        if (numThrees == 1) {
            System.out.println("three of a kind");
        }


        System.out.println();
    }


}










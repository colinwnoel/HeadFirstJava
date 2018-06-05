package Chapter5;

public class DiceRollGame {

        private int dice1Val;
        private int dice2Val;
        private int dice3Val;

        public void determineWinner(int die1, int die2, int die3){
            if ((die1 == die2) && (die1 == die3)) {

                System.out.println("We have a Yahtzee!!");

            } else {
                System.out.println("No Yahtzee this time....");
            }
        }



    public static void main(String[] args) {
        Dice myDice1 = new Dice();
        DiceRollGame myGame = new DiceRollGame();

//        myGame.dice1Val = myDice1.rollDice();
//        myGame.dice2Val = myDice1.rollDice();
//        myGame.dice3Val = myDice1.rollDice();



        int[] myDice = new int[3];

        for (int numDie = 0; numDie < 3; numDie ++){
            myDice[numDie] = myDice1.enhancedRollDice();
        }



//        int sum = myGame.dice1Val + myGame.dice2Val + myGame.dice3Val;
//
//        System.out.println("Dice 1 Value is: " + myGame.dice1Val);
//        System.out.println("Dice 2 Value is: " + myGame.dice2Val);
//        System.out.println("Dice 3 Value is: " + myGame.dice3Val);
//        System.out.println("Sum of the numbers: " + sum);

        int sum = 0;
        for (int dieValue:myDice){
            sum += dieValue;
        }

      //  int sum = myDice[0] + myDice[1] + myDice[2];

        System.out.println("Dice 1 Value is: " + myDice[0]);
        System.out.println("Dice 2 Value is: " + myDice[1]);
        System.out.println("Dice 3 Value is: " + myDice[2]);
        System.out.println("Sum of the numbers: " + sum);





        myGame.determineWinner(myDice[0],myDice[1],myDice[2]);
    }
}



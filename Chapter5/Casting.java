package Chapter5;

public class Casting {


    public static void main(String[]args){

        long myFutureInt = 42;

    /*The below won't compile because a long could contain
    a value larger than an int could store*/
        //int x = myFutureInt;

        //let's use casting to make it work
        int x = (int)myFutureInt;
        //System.out.println("myFutureInt is: " + x);

        //Nice now it works!

        //this works for the number 42 but what if its a much much bigger number....
        long myFutureShort = 40002;
        short myShort = (short)myFutureShort;
        System.out.println("This is what happens when you convert a larger primitive to a smaller: "+myShort);

    }


}

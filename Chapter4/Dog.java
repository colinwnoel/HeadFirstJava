package Chapter4;

public class Dog {
    int size;
    String name;



    void bark() {
        if (size > 60){
            System.out.println("Wooof! Wooof!");
        } else if (size > 14){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

    void bark(int numOfBarks){
        while (numOfBarks > 0){
            System.out.println("ruff");
            numOfBarks = numOfBarks -1;

        }
    }
}

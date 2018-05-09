package Chapter3;

public class Reference {


    public static void main(String[] args) {

        String[] first = new String[]{"Joe", "Phil", "Sarah"};
        String[] second = first;

        System.out.println("This is the first element from first[] " + first[0]);
        System.out.println("This is the first element from second[] " + second[0]);

        first = null;


        System.out.println("This is the first element from second[] after deleting first[] " + second[0]);

        first = new String[]{"Not Joe"};

        System.out.println("This is the first element from first[] after giving it a new value " + first[0]);
        System.out.println("This is the first element from second[] " + second[0]);

    }


}

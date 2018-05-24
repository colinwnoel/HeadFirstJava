package Chapter4;

public class Calculator {


public int add (int num1, int num2){
    return (num1 + num2);
}

public int subtract (int num1, int num2) {
    return (num1 - num2);
}

public int multiply (int num1, int num2) {
    return (num1 * num2);
}

public int divide (int num1, int num2) {
    return (num1 / num2);
}

public static void main(String[] args){
    Calculator myCalc = new Calculator();
    System.out.println("Addition: " + myCalc.add(5,7));
    System.out.println("Subtraction: " + myCalc.subtract(11,3));
    System.out.println("Multiplication: " + myCalc.multiply(2,10));
    System.out.println("Division: " + myCalc.divide(10,2));
}
}




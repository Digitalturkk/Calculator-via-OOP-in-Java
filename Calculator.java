import java.util.Scanner;

public class Calculator{
    Calculator(){
        //We need him only for declaring new objects "new Calculator()"
    }

    //Our methods for Calculator
    public int add(int a, int b){return a+b;}
    public int subtract(int a, int b){return a-b;}
    public int multiply(int a, int b){return a*b;}
    public int divide(int a, int b){return a/b;}
    public int modulo(int a, int b){return a%b;}
    public int factorial(int a){
        int b = 1;
        while(a != 1){
            b *= a;
            a--;
        }
        return b;
    }

    public static void main(String[] args){

        Calculator myCalculator = new Calculator();  // Create a Calculator object

        Scanner aAndb = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a and b");

        int a = aAndb.nextInt();  // Read user int(input())
        int b = aAndb.nextInt();

        Scanner doing = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What you want to do?");
        System.out.println("add, subtract, multiply, divide, modulo, factorial?");
        String method = doing.nextLine(); // Read user input(str)

        //Printing out what we need to calculate based on our user's choose!
        //We may use switch here, but I prefer if-else construction
        switch (method) {
            case "add":
                System.out.println(myCalculator.add(a, b));
                break;
            case "subtract":
                System.out.println(myCalculator.subtract(a, b));
                break;
            case "multiply":
                System.out.println(myCalculator.multiply(a, b));
                break;
            case "divide":
                System.out.println(myCalculator.divide(a, b));
                break;
            case "modulo":
                System.out.println(myCalculator.modulo(a, b));
                break;
            case "factorial":
                System.out.println(myCalculator.factorial(a));
                break;
            default:
                System.out.println("Wrong operation");
        }

        System.out.print("Karabakh is Azerbaijan!");


    }
}

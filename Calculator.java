import java.io.Serializable;
import java.util.Scanner;

public class Calculator{
    Calculator(){
        //We need him only for declaring new objects "new Calculator()"
    }

    //Our methods for Calculator
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public int modulo(int a, int b){
        return a%b;
    }

    public int square(int a){
        return a*a;
    }

    public int raiseToThePower(int a, int b){
        int c = 1;
        while(b > 0){
            c *= a;
            b--;
        }
        return c;
    }

    public int factorial(int n){
        int b = 1;
        while(n > 1){
            b *= n;
            n--;
        }
        return b;
    }

    public Serializable permutation(int n, int m){
        if (n-m > 0){
            int b = n-m;
            n = factorial(n);
            m = factorial(b);
            return n/m;
        } else{
            return "n-m is less than 0";
        }
    }

    public static void main(String[] args){

        Calculator myCalculator = new Calculator();  // Create a Calculator object

        Scanner aAndB = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a and b");

        int a = aAndB.nextInt();  // Read user int(input())
        int b = aAndB.nextInt();

        Scanner doing = new Scanner(System.in);  // Create a Scanner object

        System.out.println("\nWhat you want to do?");
        System.out.println("\nadd, subtract, multiply, divide, modulo, square 'of first number', raise to the power (rts), factorial, permutation?");
        String method = doing.nextLine(); // Read user input(str)

        // Printing out what we need to calculate based on our user's choose!
        // We may use switch here, but I prefer if-else construction
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
            case "square":
                System.out.println(myCalculator.square(a));
                break;
            case "rts":
                System.out.println(myCalculator.raiseToThePower(a, b));
                break;
            case "factorial":
                System.out.println(myCalculator.factorial(a));
                break;
            case "permutation":
                System.out.println(myCalculator.permutation(a, b));
                break;
            default:
                System.out.println("Wrong operation");
        }

        System.out.print("Karabakh is Azerbaijan!");


    }
}

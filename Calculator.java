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

    public static void main(String[] args){

        Calculator myCalculator = new Calculator();  // Create a Calculator object

        Scanner aAndb = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a and b");

        int a = aAndb.nextInt();  // Read user int(input())
        int b = aAndb.nextInt();

        Scanner doing = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What you want to do?");
        System.out.println("add, subtract, multiply, divide or modulo?");
        String method = doing.nextLine(); // Read user input(str)

        //Printing out what we need to calculate based on our user's choose!
        //We may use switch here, but I prefer if-else construction
        if(method.equals("add")){
            System.out.println(myCalculator.add(a,b));
        } else if(method.equals("subtract")){
            System.out.println(myCalculator.subtract(a,b));
        }else if(method.equals("mutiply")){
            System.out.println(myCalculator.multiply(a,b));
        }else if(method.equals("divide")){
            System.out.println(myCalculator.divide(a,b));
        }else if(method.equals("modulo")){
            System.out.println(myCalculator.modulo(a,b));
        }

        System.out.print("Karabakh is Azerbaijan!");


    }
}
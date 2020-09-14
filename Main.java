import java.util.Scanner;
/**
 *
 * @ThomasQuigley 
 */
public class Main {

 
  public static void main(String[] args) {
    // create the scanner
    Scanner input = new Scanner(System.in);

    // ask for their two numbers
    System.out.println("Please enter in two integers, on seperate lines, to divide.");
    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();

    // calculate the quotient and the remainder
    int quotient = firstNumber / secondNumber;
    int remainder = firstNumber % secondNumber;

    // tell them their new numbers
    System.out.println(firstNumber + "/" + secondNumber + " is " + quotient + " with a remainder of " + remainder + ".");

  }
}

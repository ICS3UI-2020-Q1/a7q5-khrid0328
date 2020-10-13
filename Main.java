/**
 * This program writes a method named firstDigit that returns the first digit of an integer
 * @author Dafna Khripun
 */
public class Main {

  // creating a method that returns the first digit of an entered integer
  public static int firstDigit(int integerStarting){

    // define the starting integer as integer 
    int integer = integerStarting;

    // use a while loop that "isolates" the first integer by: (see following comments)
    while (integer > 10){
  
      // finiding the remainder of the integer divided by 10 which leaves out the last digit
      int quotient = integer % 10;

      // dividing the product integer by 10 until it is a 1 digit number
      integer = integer / 10;
    }
    // return the final integer ( the first digit)
    return integer;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // define what number would go into the method
    int digit = firstDigit(2463);

    // print the first digit
    System.out.println(digit);
  }
}

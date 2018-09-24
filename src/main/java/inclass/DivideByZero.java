package inclass;

/** This class illustrates what happens when a program divides by zero.
 *
 * <p>Bugs: This program has no known bugs (but, for the purposes of
 * demonstration is does not work correctly!)
 *
 * @author Gregory M. Kapfhammer
 */

public class DivideByZero {

  /**
   * This method performs a division but does so incorrectly.
   **/
  public static double divideIncorrect(double first, double second) {
    double result = first / second;
    return result;
  }

  /**
   * This method performs a division but does so incorrectly.
   **/
  public static int divideIncorrect(int first, int second) {
    int result = first / second;
    return result;
  }

  /**
   * This method performs a division but does correctly.
   **/
  public static double divide(double first, double second) {
    if (second != 0) {
      double result = first / second;
      return result;
    }
    return Double.NaN;
  }

  /** The main entry point for DivideByZero.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output
   *  about the the use of incorrect and correct division methods.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    double first = 10.0;
    double second = 20.0;
    // Step One: Runs Correctly with Incorrect Method
    // output the values
    System.out.println("This approach to division will not crash for these inputs:");
    System.out.println("first = " + first);
    System.out.println("second = " + second);
    // perform the division
    double firstResult = divideIncorrect(first, second);
    // output the final values
    System.out.println("firstResult = " + firstResult);
    // Step One Explain:
    // Step Two: Runs Correctly with Correct Method
    // output the value
    double third = 10.0;
    double fourth = 0.0;
    System.out.println("This approach to division will not crash for these inputs:");
    System.out.println("third = " + third);
    System.out.println("fourth = " + fourth);
    // perform the division
    double secondResult = divide(third, fourth);
    // output the final value
    System.out.println("secondResult = " + secondResult);
    // Step Two Explain:
    // Step Three: Runs Correctly with Incorrect Method
    // output the value
    System.out.println("This approach to division will not crash for these inputs:");
    System.out.println("third = " + third);
    System.out.println("fourth = " + fourth);
    // perform the division
    secondResult = divideIncorrect(third, fourth);
    // output the final value
    System.out.println("secondResult = " + secondResult);
    // Step Three Explain:
    // Step Four: Runs Incorrectly with an Incorrect Method and int values
    // output the value
    int fifth = 10;
    int zero = 0;
    System.out.println("This approach to division will crash for these inputs:");
    System.out.println("fifth = " + fifth);
    System.out.println("zero = " + zero);
    // perform the division
    int thirdResult = divideIncorrect(fifth, zero);
    // output the final value
    System.out.println("secondResult = " + thirdResult);
    // Step Four Explain:
  }

}

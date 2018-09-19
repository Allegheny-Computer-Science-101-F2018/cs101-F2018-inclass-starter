package inclass;

/** This class illustrates two incorrect ways of swapping.
 * The first approach to swapping uses ints and the second approach
 * uses Integers. Please notice that both of these methods do not
 * swap correctly because of the fact that the Java programming
 * laguage passed both value and reference parameters by value.
 *
 * <p>Bugs: This program has no known bugs (but, for the purposes of
 * demonstration is does not work correctly!)
 *
 * @author Gregory M. Kapfhammer
 */

public class IncorrectSwap {

  /**
   * This method incorrectly swaps two values with an int.
   **/
  public static void swap(int first, int second) {
    int temp;
    temp = first;
    first = second;
    second = temp;
  }

  /** The main entry point for IncorrectSwap.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output
   *  about the the use of incorrect swapping methods.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    int first = 10;
    int second = 20;
    // output the initial values
    System.out.println("This approach to swapping does not work!")
    System.out.println("first = " + first);
    System.out.println("second = " + second);
    // perform the swap
    swap(first, second);
    // output the final values
    // TODO: Add the correct println statement for first
    // TODO: Add the correct println statement for second
    System.out.println("Can you explain why this method does not work?")
    // Write a two-line comment to explain why this does not work:
    // First line
    // Second line
  }

}

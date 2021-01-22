/*
*
* This program turn whatever number before the 
* character into extra added characters after it in string.
* @author  Wajd Mariam
* @version 2.0
* @since   2020/11/27
*/

// imports Java classes.
import java.util.Scanner;

public class StringNumber {
  /**
   * This class is what runs the program.
   */
  public static void main(String[] args) {

    // Declaring variables.
    String finalString = "";
    int timeThroughLoop = 0;
    int integer1 = 0;
    int counter = 0;
    String stringInput = "";
    
    try {
      // Getting Input:
      Scanner input1 = new Scanner(System.in);
      System.out.println("Enter a string:");
      stringInput = input1.nextLine();
    
      // For loop to check every character in string:
      for (counter = 0; counter < stringInput.length(); counter++) {
        // Determine whether  the character selected  is an int or not:
        boolean characterSelected = Character.isDigit(stringInput.charAt(counter));
        // If integer is number:
        if (characterSelected == true) {
          integer1 = Character.getNumericValue(stringInput.charAt(counter));
          timeThroughLoop = 0;
          do {
            finalString = finalString + stringInput.charAt(counter + 1);
            timeThroughLoop = timeThroughLoop + 1;
          } while (timeThroughLoop != integer1);
          // If integer is not a number:
        } else {
          finalString = finalString + stringInput.charAt(counter);
        }
      }
    } catch (Exception e) {
      System.out.println();
      finalString = finalString + stringInput.charAt(counter);
    }

    // Printing output:
    System.out.println();
    System.out.println("Your string is going to be: " + finalString);
  }
}  

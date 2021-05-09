import java.util.Scanner;
import java.util.Random;
/**
 * This program is the Rock, Paper, Scissors game.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-08
 */

public final class RockPaperScissors {
    private RockPaperScissors() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method compares the user's choice with the computer's and
    * determines who wins.
    * @param userValue This value is the user inputted choice.
    * @param compValue This value is the computer generated choice
    * @return winValue This value returns the winner.
    */
    public static String rockPaperScissorFunc(final String userValue,
                                            final String compValue) {
        // compares the values to determine a winner

        // variable
        String winValue = "";

        // if statement
        if (userValue.equals(compValue)) {
            // if match is tied
            winValue = "The match was a tie.";

        } else if (userValue.equals("rock")) {
            // if user chose rock
            if (compValue.equals("paper")) {
                // if computer chose paper
                winValue = "Sorry, the computer won.";
            } else if (compValue.equals("scissors")) {
                // if computer chose scissors
                winValue = "Congrats! You won.";
            }

        } else if (userValue.equals("paper")) {
            // if user chose paper
            if (compValue.equals("scissors")) {
                // if computer chose scissors
                winValue = "Sorry, the computer won.";
            } else if (compValue.equals("rock")) {
                // if computer chose rock
                winValue = "Congrats! You won.";
            }

        } else if (userValue.equals("scissors")) {
            // if user chose scissors
            if (compValue.equals("rock")) {
                // if computer chose rock
                winValue = "Sorry, the computer won.";
            } else if (compValue.equals("paper")) {
                // if computer chose paper
                winValue = "Congrats! You won.";
            }

        } else {
            // error catch
            winValue = "Match undetermined. Try again.";
        }

        // return value
        return winValue;
    }


    /**
    * This method takes in user input and passes to the function.
    * @param args
    */
    public static void main(final String[] args) {

        // Create new Scanner-type variable
        Scanner userInput = new Scanner(System.in);

        // random number variable
        Random rand = new Random();

        // variables
        int compNum;
        String compChoice;

        // constant
        final int two = 2;
        final int three = 3;

        // program information
        System.out.println("This is the 'Rock, Paper, Scissors' game!"
            + " Try and test your luck against the computer.");
        System.out.println();

        // Asks user to enter a integer
        System.out.print("Enter your choice (rock, paper, scissors): ");

        while (true) {
            // Takes in user input
            String userChoice = userInput.nextLine();
            userChoice = userChoice.toLowerCase();

            if (userChoice.equals("rock") || userChoice.equals("paper")
                                          || userChoice.equals("scissors")) {
                // user inputs one of 3 choices

                // generate random num
                compNum = rand.nextInt(three) + 1;

                // if statement
                if (compNum == 1) {
                    compChoice = "rock";
                } else if (compNum == two) {
                    compChoice = "paper";
                } else if (compNum == three) {
                    compChoice = "scissors";
                } else {
                    // error catch
                    System.out.println("Please re-enter your choice: ");
                    continue;
                }

                // call function
                String winner = rockPaperScissorFunc(userChoice, compChoice);

                // print output to console
                System.out.println("");
                System.out.println("You chose: " + userChoice);
                System.out.println("The computer chose: " + compChoice);
                System.out.println("");
                System.out.println(winner);

            } else {
                // error catch
                System.out.println("That's not an option! Try again.");
                System.out.print("Enter your choice (rock, paper, scissors): ");
                continue;
            }
            break;
        }
        System.out.println("");
        System.out.println("Done.");
    }
}

import java.util.Scanner;

public class Prompter {
  private Game game;
  boolean stillCalculating = true;

  public Prompter(Game game) {
    this.game = game;
  }

  public char promptForChoice() {
    Scanner scanner = new Scanner(System.in);
    boolean isAcceptable = false;
    char calcType;
    do {
      System.out.printf("What calculation do you want - (a)ddition, (s)ubtraction, (d)ivision or (m)ultiplication?\n");
      String calcTypeInput = scanner.nextLine();
      calcType = calcTypeInput.charAt(0);
      System.out.println("\nYour previous answers: " + game.answers);
      System.out.printf("\n");
      try {
        game.selectedType(calcType);
        if (calcType == 'a') {
          game.addition();
        }
        else if (calcType == 's') {
          game.subtraction();
        }
        else if (calcType == 'd') {
          game.division();
        }
        else if (calcType == 'm') {
          game.multiplication();
        }
        isAcceptable = true;
      } catch (IllegalArgumentException iae) {
        System.out.printf("%s Please try again.\n\n", iae.getMessage());
      }
    } while (! isAcceptable);
    return calcType;
  }

  public boolean stillInterested() {
    Scanner scanner = new Scanner(System.in);
    char keepGoing;
    if (stillCalculating == true) {
      System.out.printf("Do you want to use the calculator? (y/n):\n");
      String calcTypeInput = scanner.nextLine();
      keepGoing = calcTypeInput.charAt(0);
      keepGoing = Character.toLowerCase(keepGoing);
      System.out.printf("\n");
      if (keepGoing != 'y') {
        System.out.println("Your previous answers: " + game.answers);
        stillCalculating = false;
      }
    }
    return stillCalculating;
  }
}

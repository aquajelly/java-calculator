import java.util.Scanner;
import java.util.ArrayList;

public class Game {

  ArrayList<Number> answers = new ArrayList<Number>();

  private char normaliseInput(char calcType) {
    if (! (Character.isLetter(calcType) && ( calcType == 'a' || calcType == 's' || calcType == 'd' || calcType == 'm' ))) {
      throw new IllegalArgumentException(calcType + " is not a valid calculation type!");
    }
    return calcType;
  }

  public void selectedType(char input) {
    input = normaliseInput(input);
  }

  public void addition() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("You chose addition. Type in your first number:\n");
    String input1 = scanner.nextLine();
    int firstInput = Integer.parseInt(input1);
    System.out.printf("Type in your second number:\n");
    String input2 = scanner.nextLine();
    int secondInput = Integer.parseInt(input2);
    int Answer = firstInput + secondInput;
    System.out.printf("Your answer is: %d\n", Answer);
    answers.add(Answer);
  }

  public void subtraction() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("You chose subtraction. Type in your first number:\n");
    String input1 = scanner.nextLine();
    int firstInput = Integer.parseInt(input1);
    System.out.printf("Type in your second number:\n");
    String input2 = scanner.nextLine();
    int secondInput = Integer.parseInt(input2);
    int Answer = firstInput - secondInput;
    System.out.printf("Your answer is: %d\n", Answer);
    answers.add(Answer);
  }

  public void division() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("You chose division. Type in your first number:\n");
    String input1 = scanner.nextLine();
    int firstInput = Integer.parseInt(input1);
    System.out.printf("Type in your second number:\n");
    String input2 = scanner.nextLine();
    int secondInput = Integer.parseInt(input2);
    float Answer = (float) firstInput / secondInput;
    System.out.printf("Your answer is: %f\n", Answer);
    answers.add(Answer);
  }

  public void multiplication() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("You chose multiplication. Type in your first number:\n");
    String input1 = scanner.nextLine();
    int firstInput = Integer.parseInt(input1);
    System.out.printf("Type in your second number:\n");
    String input2 = scanner.nextLine();
    int secondInput = Integer.parseInt(input2);
    int Answer = firstInput * secondInput;
    System.out.printf("Your answer is: %d\n", Answer);
    answers.add(Answer);
  }
}

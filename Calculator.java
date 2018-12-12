public class Calculator {
  public static void main(String[] args) {
    Game game = new Game();
    Prompter prompter = new Prompter(game);
    while (prompter.stillInterested() == true) {
      prompter.promptForChoice();
    }
    prompter.stillInterested();
  }
}

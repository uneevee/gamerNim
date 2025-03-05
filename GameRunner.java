/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!\nHow many players would you like?");
    Text.addPlayers();
    Text nim = new Text();
    while(nim.startGame()) {
    	nim = new Text();
    }
    System.out.println("Goodbye!");
  }
  // WAT !!!private enum wat {RED, BLUE, GREEN};
}

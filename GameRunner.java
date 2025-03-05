/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
public class GameRunner
{
  public static void main(String[] args)
  {
    
    Text.addPlayers();
    Text nim = new Text();
    nim.setNumber();
    while(nim.startGame()) {
    	nim = new Text();
    	nim.setNumber();
    }
    System.out.println("Goodbye!");
  }
  // WAT !!!private enum wat {RED, BLUE, GREEN};
}

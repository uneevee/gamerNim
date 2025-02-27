import java.util.Scanner;
public class Game {
    protected int number; 
    protected int startingNum;
    protected int lastMove;
    private static int totalGames = 0;
    private Scanner bigBrother = new Scanner(); // He is always listening
    public Games(int players, int start){
        startingNum = start;
        number = start;
        totalGames += 1;
    }
    public void gameLoop(){
        
        while(true){
            if(number <= 0){
                break;
            }
            String nextMove = bigBrother.nextLine();
            System.out.print("The current Nim is "+ number + "What do you want to subtract by?");
            //Placeholder LogicChecker Example
            LogicChecker.check(0);// joshes code
        }
    }
}

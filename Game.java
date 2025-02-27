import java.util.Scanner;
public class Game {
    protected int number; 
    protected int startingNum;
    protected int lastMove;
    private Scanner bigBrother = new Scanner(); // He is always listening
    public void gameLoop(){
        
        while(true){
            if(number <= 0){
                break;
            }
            String nextMove = bigBrother.nextLine();
            System.out.print("The current Nim is "+ number + "What do you want to subtract by?");

        }
    }
}

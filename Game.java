import java.util.Scanner;
public class Game {
    protected int number; 
    protected int startingNum;
    protected int lastMove;
    private Scanner input = new Scanner();
    public void gameLoop(){
        while(true){
            if(number <= 0){
                break;
            }
            System.out.print("The current Nim is "+ number + "What do you want to subtract by?");
            
        }
    }
}

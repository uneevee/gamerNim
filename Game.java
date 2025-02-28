import java.util.Scanner;
public class Game {
    protected int number; 
    protected int startingNum;
    protected int lastMove;
    private static int totalGames = 0;
    private Scanner bigBrother = new Scanner(System.in); // He is always listening
    public Game() {
    	startingNum = 20;
    	number = 20;
    	totalGames += 1;
    }
    public Game(int players, int start){
        startingNum = start;
        number = start;
        totalGames += 1;
    }
    protected boolean gameLoop(int count){
    	//TODO: Pass input to logicChecker and decide to subtract or rerequest input
    	//Josh's code to handle
            //Placeholder LogicChecker Example
        while(true){
            if(logicChecker(count)) {
            	number -= count;
                break;
            } 
        }
        if(number == 0){return true} else {return false}

    }
    
    private static boolean logicChecker(int count) {
    	//TODO: add logic to check, Lucas
        if (count*2 < number && count > 0 || number ==1 && count ==1){
            return true;
        }
        else
        {
            return false;
        }
    	
    }
}

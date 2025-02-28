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
    public void gameLoop(){
    	//TODO: Pass input to logicChecker and decide to subtract or rerequest input
    	//Josh's code to handle
        while(true){
            if(number <= 0){break;} //break out of main loop if number == 0
            /*
            System.out.print("The current Nim is "+ number + "What do you want to subtract by?");
            String nextMove = bigBrother.nextLine();
            //Placeholder LogicChecker Example
            if(logicChecker(0)) {
            	//Fits logic code, subtract.
            } else {
            	//Does not fit logic, retry
            }
            */
        }
    }
    
    public static boolean logicChecker(int count) {
    	//TODO: add logic to check, Lucas 
    	return true;
    }
}

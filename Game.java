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
    protected void gameLoop(){
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
    
    private static boolean logicChecker(int count) {
    	//TODO: add logic to check, Lucas
        if (count*2 < number && count > 0 || number ==1 && count ==1){// I check for if it does try to make a number that may or may not work work so then i check the number with code and the code trys to see if the count is half or a little more than half of the number and if count is not more than 1 but also if the number is one and the count is one
            return true;
        }
        else
        {
            return false;
        }
    	
    }
}

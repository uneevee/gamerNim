import java.util.ArrayList;

public class Game {
    protected int number; 
    protected int startingNum;
    protected int lastMove;
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected int currentPlayer;
    private static int totalGames = 0;
    
    protected Game() {
    	players = Player.getPlayers();
    	startingNum = 20;
    	number = 20;
    	totalGames += 1;
    }
    protected Game(int players, int start){
        startingNum = start;
        number = start;
        totalGames += 1;
    }
    protected boolean gameLoop(int count){
    	//TODO: Pass input to logicChecker and decide to subtract or rerequest input
    	//Josh's code to handle
        //Placeholder LogicChecker Example
        if(logicChecker(count)) {
        	lastMove = count;
        	number -= count;
        	currentPlayer = (players.size() > currentPlayer + 1)?currentPlayer + 1: 0; //If player + 1 is outside of list bounds, reset player to 0
        	return !(number == 0);
        } else {
        	System.out.println("Invalid number!");
        	return true;
        }

    }
    
    private boolean logicChecker(int count) {
    	//TODO: add logic to check, Lucas
        if (count*2 <= number && count > 0 || number ==1){// I check for if it does try to make a number that may or may not work work so then i check the number with code and the code trys to see if the count is half or a little more than half of the number and if count is not more than 1 but also if the number is one and the count is one
            return true;
        }
        else
        {
            return false;
        }
    	
    }

    //Suda 
	protected Player endGame(){
		currentPlayer = (0 <= currentPlayer - 1)?currentPlayer - 1: players.size()-1;
		//TODO: End the game, change winLoss for each player, ask to play again
        for(Player player : players){
            if(player == players.get(currentPlayer)){
                player.addLoss();
            } else {
                player.addWin();
            }
        }
        return players.get(currentPlayer);
	}
}

public class Text extends Game{
	//Mace's
	private Scanner bigBrother = new Scanner(System.in); // He is always listening
	public boolean startGame(){
		System.out.println()
		String input = bigBrother.nextLine();
		gameLoop(input.toInt());
		return endGame(); //if true, play again.
	}
	//Suda
	private boolean endGame(){
		//TODO: End the game, change winLoss for each player, ask to play again
	}
}

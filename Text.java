import java.util.Scanner;

public class Text extends Game{
	//Mace's
	private Scanner bigBrother = new Scanner(System.in); // He is always listening
	public boolean startGame(){
		System.out.println()
		String input = bigBrother.nextLine();
		gameLoop(input.toInt());
		return endGame(); //if true, play again.
	}
}

import java.util.Scanner;

public class Text extends Game{
	//Mace's
	private Scanner bigBrother = new Scanner(System.in); // He is always listening
	public boolean startGame(){
		boolean running = true;
		while(running) {
			System.out.println("There is " + number + " nims left.\nHow many would you like to take? (1 to " + number/2 + ")");
			String input = bigBrother.nextLine();
			running = gameLoop(Integer.parseInt(input));
		}
		System.out.println(endGame().getName() + "lost!\n Leaderboard"); //if true, play again.
		for(Player x:players) {
			int[] winLoss = x.getWinLoss();
			System.out.println(x.getName() + ":   " + winLoss[0] + "wins   " + WinLoss[1] + "losses");
		}
	}
}

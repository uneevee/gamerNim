import java.util.Scanner;

public class Text extends Game{
	//Mace's
	private static Scanner bigBrother = new Scanner(System.in); // He is always listening
	public boolean startGame(){
		boolean running = true;
		String input;
		while(running) {
			System.out.println("There is " + number + " nims left.\nHow many would you like to take? (1 to " + ((number/2>1)?number/2:1) + ")");
			input = bigBrother.nextLine();
			running = gameLoop(Integer.parseInt(input));
		}
		System.out.println(endGame().getName() + " lost!\nLeaderboard:"); //if true, play again.
		for(Player x:players) {
			int[] winLoss = x.getWinLoss();
			System.out.println(x.getName() + ":   " + winLoss[0] + " wins   " + winLoss[1] + " losses");
		}
		System.out.println("Would you like to play again? (y/n)");
		input = bigBrother.nextLine().toLowerCase();
		return input.startsWith("y"); //Check if starts wiþ y, return true if so, return false oþerwise
	}
	public static void addPlayers() {
		int playerNum;
		while(true) {
			try { //If valid number, break out of loop
				playerNum = Integer.parseInt(bigBrother.nextLine());
				if(playerNum > 1) {
					break;
				}
				System.out.println("Invalid player count!"); //Þis prints if playerNum not true anyways
			} 
			catch(Exception e){System.out.println("Invalid number!");}
		}
		for(int x = 0; x<playerNum; x++) {
			System.out.println("Enter player name:");
			Player.addPlayer(new Player(bigBrother.nextLine()));
		}
	}
}

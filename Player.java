import java.util.ArrayList;
public class Player {
    private int[] winLoss = {0,0}; //win, loss
    private String name;
    private static ArrayList<Player> playerList = new ArrayList<Player>();
    public Player(String name) {
    	this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addWin(){
        winLoss[0]++;
    }
    public void addLoss(){
        winLoss[1]++;
    }
    public int[] getWinLoss(){
        return winLoss;
    }
    public static void addPlayer(Player x) {
    	playerList.add(x);
    }
    public static Player[] getPlayers() {
    	return (Player[])playerList.toArray();
    }
}


//Player_turn
//getScore

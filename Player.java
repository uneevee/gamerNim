public class Player {
    private int[] winLoss = {0,0}; //win, loss
    private String name;
    public Player(String name) {
    	this.name = name;
    }
    public getName(name){
        return name
    }
    public void addWin(){
        winLoss[0]++;
    }
    public void addLoss(){
        winLoss[1]++;
    }
    public int[] getWinLoss(){
        return winLoss
    }
}


//Player_turn
//getScore

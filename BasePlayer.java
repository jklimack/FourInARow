
import java.util.Random;


public class BasePlayer implements Player{
    
    int[][] board;
    int curIndex;
    
    public BasePlayer(int playerIndex){
        curIndex = playerIndex;
    }//end constructor
    
    public void setGameState(int[][] board){
        this.board = board;
    }//end method
    
    public int getAction(){
        Random rand = new Random();
        return rand.nextInt(board[0].length);
    }//end method
    
}//end class

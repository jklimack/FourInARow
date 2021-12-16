

public class ConnectFour implements Environment{
    
    private boolean gameOver = false;
    private int[][] board = new int[6][6];
    
    
    public ConnectFour(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = -1;
            }
        }
    }//end constructor
    
    public boolean isGameOver(){
        return gameOver;
    }//end method
    
    
    public int[][] getState(){
        return board;
    }//end method
    
    public void update(int playerIndex, int action){
        System.out.println("COLUMN: " + action);
        try{
            for(int i = board[0].length-1;i>=0;i--){
                if (board[i][action] == -1){
                    board[i][action] = playerIndex;
                    break;
                }//end if
            }//end for
            //check for win...to do
        }
        catch (Exception e){
            System.out.println("INVALID PLAYER ACTION");
        }
    }//end method
    
    public void displayToConsole(){
        for(int[] r : board){
            for(int val:r){
                System.out.print(" " + val);
            }
            System.out.println("");
        }
    }//end method
    
}//end class

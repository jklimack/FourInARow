

public class Runner {
    
    public static void main(String[] args) {
        Environment e = new ConnectFour();
        Player[] players = new Player[2];
        players[0] = new BasePlayer(0);
        //replace with
        //players[0[= new Ariana(0);
        
        players[1] = new BasePlayer(1);
        
        int playerMove = 0;
        int c = 0;
        
        while(!e.isGameOver()){
            c = c+1;
            if(c>5) break;
            
            players[playerMove].setGameState(e.getState());
            //give player a board
            int playerAction = players[playerMove].getAction();
            
            
            e.update(playerMove, playerAction);
            e.displayToConsole();
            
            // Move to the next player
            playerMove = (playerMove + 1) % players.length;
        }//end while
        
    }//end main
    
    
}//end class

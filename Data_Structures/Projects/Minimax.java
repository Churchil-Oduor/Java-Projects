//package Data_Structures;


public class Minimax{

    private String []board = new String[9];
    private int depth;
    

    Minimax(int depth){
        this.depth = depth;
    }
    
    public int minimax(boolean player, String[] board, int depthCount){
        this.board = board;
        int score = 0;
        //is conputer , then player=> true else if human ,player => false
        if(player){

                        if(depthCount != depth) {
                            for(int i=0 ; i < 9 ; i++){
                                if(board[i] == "*"){
                                    board[i] ="X";

                                    if(checkBoardStatus(board, player)){
                                        score = 1;
                                        break;
                                    }else{
            
                                        depthCount++;
                                        score = minimax(false, board, depthCount);

                                    }
                                    
                                }else{
                                    continue;
                                }
                            }
                        }else if(depthCount == depth){

                            for(int i=0 ; i < 9 ; i++){
                                if(board[i] == "*"){
                                    board[i] ="X";

                                    if(checkBoardStatus(board, player)){
                                        score = 1;
                                        break;

                                    }else{
                                    
                                        score = 0;
                                        
                                    }
                                    

                                }else{
                                    continue;
                                }
                            }

                        }
                    }
            else{


                        if(depthCount != depth) {
                            for(int i=0 ; i < 9 ; i++){
                                if(board[i] == "*"){
                                    board[i] ="O";

                                    if(checkBoardStatus(board, player)){
                                        score = -1;

                                    }else{
                                        depthCount++;
                                        score = minimax(true, board, depthCount);
                                    }
                                    

                                }else{

                                    continue;
                                }
                            }
                        }else if(depthCount == depth){

                            for(int i=0 ; i < 9 ; i++){
                                if(board[i] == "*"){
                                    board[i] ="O";

                                    if(checkBoardStatus(board, player)){
                                        score = -1;
                                        break;

                                    }else{
                                    
                                        score = 0;
                                    }
                                    
                                }else{
                                    continue;
                                }
                            }

                        }
                    }

                    return score;
        }


    

    public boolean checkBoardStatus(String[] board, boolean who_is_player){
        String player = "X"; // the Opponent
        
        if(!who_is_player){
            player = "O";
        }

        if(
        board[0].equalsIgnoreCase(player) && board[1].equalsIgnoreCase(player) && 
        board[2].equalsIgnoreCase(player) || board[3].equalsIgnoreCase(player) && 
        board[4].equalsIgnoreCase(player) && board[5].equalsIgnoreCase(player) || 
        board[6].equalsIgnoreCase(player) && board[7].equalsIgnoreCase(player) && 
        board[8].equalsIgnoreCase(player) 
        ||
        board[0].equalsIgnoreCase(player) && board[3].equalsIgnoreCase(player) && 
        board[6].equalsIgnoreCase(player) || board[1].equalsIgnoreCase(player) && 
        board[4].equalsIgnoreCase(player) && board[7].equalsIgnoreCase(player) || 
        board[2].equalsIgnoreCase(player) && board[5].equalsIgnoreCase(player) && 
        board[8].equalsIgnoreCase(player)  
        || 
        board[0].equalsIgnoreCase(player) && board[4].equalsIgnoreCase(player) && 
        board[8].equalsIgnoreCase(player) || board[2].equalsIgnoreCase(player) && 
        board[4].equalsIgnoreCase(player) && board[6].equalsIgnoreCase(player) 
        ) {

            return true;

        }else{

            return false;
        }


    }
}
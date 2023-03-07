package Projects;
import java.util.Scanner;


public class Tic_Tac_Toe{


    private String [] positions = {"*","*","*","*","*","*","*","*","*"};
    private int position;

    Minimax minmax = new Minimax(10);
    public void printBoard(){
        
       
        System.out.println("    -----TIC TAC TOE Console-----\n");
        System.out.println("            "+ " " + " | " + "  " + "| ");
        System.out.println("            " + positions[0]+ " | " + positions[1] + " | " + positions[2]);
        System.out.println("            "+ " " + " | " + "  " + "| ");
        System.out.println("         --------------");
        System.out.println("            "+ " " + " | " + "  " + "| ");
        System.out.println("            " + positions[3]+ " | " + positions[4] + " | " + positions[5]);
        System.out.println("            "+ " " + " | " + "  " + "| ");
        System.out.println("         --------------");
        System.out.println("            "+ " " + " | " + "  " + "| ");
        System.out.println("            " +positions[6]+ " | " + positions[7] + " | " + positions[8]);
        System.out.println("            "+ " " + " | " + "  " + "| ");
     
    }

    public int getPosition(){ //this method gets the positions entered by the user upon prompt
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Position: ");
        position = scan.nextInt();
        position -= 1;
        
        return position;
    }

    public boolean isBoardFull(){ // this method checks if there are any moves available that can be made on the board
        boolean boardisFull = true;
        
        for(int i = 0; i < 9 ; i++){
            if(positions[i].equalsIgnoreCase("*")){
                boardisFull = false;
                break;
            }
        }
        return boardisFull;
    }



    public boolean Game(int player){
       
        boolean gameOver = false;
        Minimax min = new Minimax(5);
        printBoard();
        String board[] = new String[9];
        board = positions.clone();//creating a duplicate of board so that program can manipulate different boards

        int bestMove = 0, res = 0;
        if(player == 1){
            
            for(int i = 0; i < 9 ; i++){
                if(positions[i].equalsIgnoreCase("*")){
                
                     res = minmax.minimax(false, board, 0);
                   if(res < bestMove){
                        bestMove = i;
                      
                        break;
                    }else{
                        bestMove = i;
                    }
                }
            }
                     positions[bestMove] = "X";
                     printBoard();

                    if(min.checkBoardStatus(positions, true)){
                        gameOver = true;
                        System.out.println("You lost the game");
                    }else{
                        
                        player = 2;
                    }


        }else{
        
                    positions[getPosition()] = "O";
                    printBoard();
                    if(min.checkBoardStatus(positions, false)){
                        gameOver = true;
                        System.out.println("You won!!");
                    }else{
                        
                        player = 1;

                    }
        }

        return gameOver;
    }   
}

   
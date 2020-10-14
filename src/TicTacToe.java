import java.util.*;
class TicTacToe {
    public static void main(String[] args) {
    	
            Scanner sc = new Scanner(System.in);
            String input = "_________";
            char[] ttt = input.toCharArray();
            int X=0;
            int O=0;
            int pos = 0;
            int leftC = 0;
            int rightC = 0;
            int count = 1;
            boolean emptyCells=false;
            boolean winsX=false;
            boolean winsO=false;
            
            System.out.print("---------\n");
            System.out.print("| " + input.substring(0,1) + " " + input.substring(1,2) + " "+ input.substring(2,3) + " |\n");
            System.out.print("| " + input.substring(3,4) + " " + input.substring(4,5) + " "+ input.substring(5,6) + " |\n");
            System.out.print("| " + input.substring(6,7) + " " + input.substring(7,8) + " "+ input.substring(8,9) + " |\n");
            System.out.println("---------");
            
            for (int i = 0; i < ttt.length; i++) {
                if (ttt[i] == 'X'){
                    X += 1;
                }
                if (ttt[i] == 'O'){
                    O += 1;
                }
                if (ttt[i] == '_') {
                    emptyCells = true;
                }
            }
            
            while(true){
            	try{
            	System.out.print("Enter the coordinates: ");
                leftC = sc.nextInt();
                rightC = sc.nextInt();
                }
            	catch (InputMismatchException exception){
            		System.out.println("You should enter numbers!");
            		String bad_input = sc.nextLine();
            		continue;
            	}
                
            	if(leftC==1 && rightC==3)pos=0;
           	 	if(leftC==2 && rightC==3)pos=1;
           	 	if(leftC==3 && rightC==3)pos=2;
           	 	if(leftC==1 && rightC==2)pos=3;
           	 	if(leftC==2 && rightC==2)pos=4;
           	 	if(leftC==3 && rightC==2)pos=5;
           	 	if(leftC==1 && rightC==1)pos=6;
           	 	if(leftC==2 && rightC==1)pos=7;
           	 	if(leftC==3 && rightC==1)pos=8;
            	
           	 	if((leftC > 3) || (rightC > 3))
           	 		System.out.println("Coordinates should be from 1 to 3!");
            
           	 	else if (ttt[pos] == 'X' || ttt[pos] == 'O')
           	 		System.out.println("This cell is occupied! Choose another one!");
            
           	 	else if (ttt[pos] == '_' && count%2 == 0){
           	 		ttt[pos] = 'O';
           	 		System.out.print("---------\n");
           	 		System.out.print("| " + ttt[0] + " " + ttt[1] + " "+ ttt[2] + " |\n");
           	 		System.out.print("| " + ttt[3] + " " + ttt[4] + " "+ ttt[5] + " |\n");
           	 		System.out.print("| " + ttt[6] + " " + ttt[7] + " "+ ttt[8] + " |\n");
           	 		System.out.println("---------");
           	 		count++;
                }
             
           	 	else{
           	 		ttt[pos] = 'X';
           	 		System.out.print("---------\n");
           	 		System.out.print("| " + ttt[0] + " " + ttt[1] + " "+ ttt[2] + " |\n");
           	 		System.out.print("| " + ttt[3] + " " + ttt[4] + " "+ ttt[5] + " |\n");
           	 		System.out.print("| " + ttt[6] + " " + ttt[7] + " "+ ttt[8] + " |\n");
           	 		System.out.println("---------");
           	 		count++;
            	 
           	 	}
             
           	 	if (ttt[0] + ttt[1] + ttt[2] == 264 ||
                     ttt[3] + ttt[4] + ttt[5] == 264 ||
                         ttt[6] + ttt[7] + ttt[8] == 264 ||
                             ttt[0] + ttt[4] + ttt[8] == 264 ||
                                 ttt[2] + ttt[4] + ttt[6] == 264 ||
                                      ttt[0] + ttt[3] + ttt[6] == 264 ||
                                           ttt[1] + ttt[4] + ttt[7] == 264 ||
                                                ttt[2] + ttt[5] + ttt[8] == 264) {
           	 		winsX = true;
           	 		break;
           	 	}
           	 	
           	 	if (ttt[0] + ttt[1] + ttt[2] == 237 ||
                     ttt[3] + ttt[4] + ttt[5] == 237 ||
                          ttt[6] + ttt[7] + ttt[8] == 237 ||
                              ttt[0] + ttt[4] + ttt[8] == 237 ||
                                 ttt[2] + ttt[4] + ttt[6] == 237 ||
                                     ttt[0] + ttt[3] + ttt[6] == 237 ||
                                         ttt[1] + ttt[4] + ttt[7] == 237 ||
                                             ttt[2] + ttt[5] + ttt[8] == 237) {
           	 		winsO = true;
           	 		break;
           	 	}
            }
            
            if (X - O > 1 || X - O < -1 || (winsX == true && winsO == true)){
                System.out.println("Impossible");
            } else if (winsX == false && winsO == false && emptyCells == true){
                System.out.println("Game not finished");
            } else if (winsX == false && winsO == false && emptyCells == false){
                System.out.println("Draw");
            } else if (winsX == true && winsO == false){
                System.out.println("X wins");
            }  else if (winsX == false && winsO == true){
            System.out.println("O wins");
            }
    }
}
                 
            
          
           
    										


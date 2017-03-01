
public class Board 
{
 private char [][] theBoard;
 
 public Board ()
 {
	 this.theBoard = new char [6][7];
	 this.resetBoard();
	
 }
 
 public boolean makeMove(int col, char move)
 {
	 int index = 0;
	 for (int i = 0; i < this.theBoard.length; i++)
	 {
		 if (this.theBoard[i][col] == '_');
	 {
		 index++;
	 
 	 }
}
 
 if (index == 0)
	 {
		 return false;
	 }
 else if ((this.theBoard[index-1][col] == '_'))
	 {
		 this.theBoard[index-1][col] = move;
		 return true;
	 }
 return false;
 }
 
 private void resetBoard()
 {
		 for (int i = 0; i<this.theBoard.length; i++)
		 {
			 for (int j = 0; j < this.theBoard[i].length; j++)
			 {
				 this.theBoard[i][j] = '_';
			 }
		 }
 }
 
 public boolean isWinner()
 {
boolean col11Winner = this.theBoard[0][0] != '_' && this.theBoard[0][0] == this.theBoard[1][0] &&
		 			  this.theBoard[0][0] == this.theBoard[2][0] && this.theBoard[0][0] == this.theBoard[3][0];

	
boolean col12Winner = this.theBoard[1][0] != '_' && this.theBoard[1][0] == this.theBoard[2][0] &&
 						this.theBoard[1][0] == this.theBoard[3][0] && this.theBoard[1][0] == this.theBoard[4][0];

	
boolean col13Winner =  this.theBoard[2][0] != '_' && this.theBoard[2][0] == this.theBoard[3][0] &&
 						this.theBoard[2][0] == this.theBoard[4][0] && this.theBoard[2][0] == this.theBoard[5][0];

boolean col14Winner = this.theBoard[3][0] != '_' && this.theBoard[3][0] == this.theBoard[4][0] &&
 						this.theBoard[3][0] == this.theBoard[5][0] && this.theBoard[3][0] == this.theBoard[6][0];

	
return col11Winner || col12Winner || col13Winner || col14Winner;

//boolean col21Winner = this.theBoard[0][0] != '_' && this.theBoard[0][0] == this.theBoard[0][1] &&
 //this.theBoard[0][0] == this.theBoard[0][2] && this.theBoard[0][0] == this.theBoard[0][3];

 }

	
 public void display()
 {
	 for (int i = 0; i<this.theBoard.length; i++)
	 {
		 for (int j = 0; j < this.theBoard[i].length; j++)
		 {
			System.out.print(this.theBoard[i][j] + "\t");
		 }
		 System.out.println("\n\n");
	 }
 }
}

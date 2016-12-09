package inlamningsuppgiftSudoku;

public class Algorithm {

	private SudokuBoard board;

public Algorithm (SudokuBoard board){
	this.board = board;
}


public boolean backtrace(int currentRow, int currentCol){
	if(!board.table[currentRow][currentCol].getFlag()){
	for(i = 1; i<10; i++){
		if(!board.ultimateContains(currentCol,currentRow,i)){
			board.table[currentRow][currentCol].setValue(i);
			if(backtrace(current))
		}
	}
	return false;
	}
if (currentCol == 9){
	return backtrace(currentRow+1,1);
}else {
	
return backtrace(currentRow,currentCol+1);
}

}

private int[] nextRowAndCol(int currentRow,int currentCol){ //TODO implementera en koll för om det är sista platsen
    int[]
	if (currentCol == 9){
		[0] = currentRow+1;
		int[1] = 1;
	}
}
}

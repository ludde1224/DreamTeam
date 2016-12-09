package inlamningsuppgiftSudoku;

public class Algorithm {

	private SudokuBoard board;

public Algorithm (SudokuBoard board){
	this.board = board;
}


public boolean backtrace(int currentRow, int currentCol){
	if(!board.table[currentRow][currentCol].getFlag()){ //fixa med att sätta in flaggan
	for(int i = 1; i<10; i++){
		if(!board.ultimateContains(currentCol,currentRow,i)){
			board.table[currentRow][currentCol].setValue(i);
			if(backtrace(nextRow(currentRow,currentCol),nextCol(currentRow,currentCol))){
				return true;
			}
		}
	}
	return false;
	}
	return backtrace(nextRow(currentRow,currentCol),nextCol(currentRow,currentCol));
}

private int nextRow(int currentRow,int currentCol){ //TODO implementera en koll för om det är sista platsen
	if (currentCol == 9){
		return currentRow+1;
	} else {
		return currentRow;
	}
}
private int nextCol(int currentRow,int currentCol){ //TODO implementera en koll för om det är sista platsen
	if (currentCol == 9){
		return 1;
	} else {
		return currentCol+1;
	}
}
}

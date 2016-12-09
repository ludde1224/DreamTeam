package inlamningsuppgiftSudoku;

public class SudokuBoard {
	Matrix[][] table = new Matrix[3][3];

	private SudokuNumber[] rowAdder(int number) {
		SudokuNumber[] row = new SudokuNumber[9];
		int index = 0;

		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				row[index] = table[1][i].getRow(number)[number];
				index++;
			}
		}
		return row;
	}
	
	private SudokuNumber[] colAdder(int number) {
		SudokuNumber[] col = new SudokuNumber[9];
		int index = 0;
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				col[index] = table[i][1].getRow(number)[number];
				index++;
			}
		}
		return col;
	}
	
	public SudokuNumber[] fullRow (int rowNumber){
		if(rowNumber <= 3){
			return rowAdder(rowNumber);
		}
		if(rowNumber<= 6){
			return rowAdder(rowNumber+3);
		}else{
			return rowAdder(rowNumber+6);
		}
	}
	public SudokuNumber[] fullCol (int rowNumber){
		if(rowNumber <= 3){
			return colAdder(rowNumber);
		}
		if(rowNumber<= 6){
			return colAdder(rowNumber+3);
		}else{
			return colAdder(rowNumber+6);
		}
	}
}
package inlamningsuppgiftSudoku;

public class SudokuBoard {
	SudokuNumber[][] table;
	
	
	public SudokuBoard(int[][] numbers){
		table = new SudokuNumber[9][9];
	}
	/**
	 * Unders�ker om det finns tv� tal p� samma rad
	 * 
	 * @param number
	 *            numret som ska kollas om det finns ett liknande
	 * @param rowNumber
	 *            Radnumret till raden som ska unders�kas
	 * @return Blir true om tv� liknande tal finns annars false
	 */
	public boolean rowContains(int rowNumber, int number){
		for(int n = 0 ; n<9 ; n++){
			if(table[rowNumber][n].getValue() == number){ // Antar att alla rutor har ett v�rde
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Tittar om det finns tv� tal i samma column
	 * 
	 * @param number
	 *            numret som ska kollas
	 * @param colNumber
	 *            Columnnumret till columnen som ska unders�kas
	 * @return Retunerar true om tv� liknande tal finns annars false
	 */
	public boolean colContains(int colNumber, int number){
		for(int n = 0; n<9; n++){
			if(table[n][colNumber].getValue() == number){ // Antar att alla rutor har ett v�rde
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Kollar om matrisen inneh�ller numret "number"
	 * 
	 * @param number
	 *            numret som ska kollas
	 * @return Blir sann om matrisen inneh�ller number
	 */
	private int startNumber(int number){
		if (number < 4){
			return 1;
		} else if(number > 6){
			return 7;
		} else {
			return 4;
		}
	}
	
	/**
	 * Kollar om matrisen inneh�ller numret "number"
	 * 
	 * @param number
	 *            numret som ska kollas
	 * @return Blir sann om matrisen inneh�ller number
	 */
	public boolean sectionContains( int rowNumber,int colNumber, int number){
		int rowIndex = startNumber(rowNumber);
		int colIndex = startNumber(colNumber);
		for(int n = rowIndex; n < rowIndex+3; n++){
			for(int i = colIndex; i < i+3; i++){
				if(table[n][i].getValue()==number){
					return true;
				}
			}
		}
		//table[startNumber(rowNumber)][startNumber(colNumber)];
		return false;
	}
	
	/**
	 * Kollar om matrisen inneh�ller numret "number"
	 * 
	 * @param number
	 *            numret som ska kollas
	 * @return Blir sann om matrisen inneh�ller number
	 */
	public boolean ultimateContains(int rowNumber, int colNumber,  int number){
		if(rowContains(rowNumber, number)|| colContains(rowNumber, number)|| sectionContains(rowNumber,colNumber,number) ){
			return true;
		}
		return false;
	}
	
	
	
//	private SudokuNumber[] rowAdder(int number) {
//		SudokuNumber[] row = new SudokuNumber[9];
//		int index = 0;
//
//		for (int i = 0; i < 3; i++) {
//			for (int n = 0; n < 3; n++) {
//				row[index] = table[1][i].getRow(number)[number];
//				index++;
//			}
//		}
//		return row;
//	}
//	
//	private SudokuNumber[] colAdder(int number) {
//		SudokuNumber[] col = new SudokuNumber[9];
//		int index = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int n = 0; n < 3; n++) {
//				col[index] = table[i][1].getRow(number)[number];
//				index++;
//			}
//		}
//		return col;
//	}
	
//	public SudokuNumber[] fullRow (int rowNumber){
//		if(rowNumber <= 3){
//			return rowAdder(rowNumber);
//		}
//		if(rowNumber<= 6){
//			return rowAdder(rowNumber+3);
//		}else{
//			return rowAdder(rowNumber+6);
//		}
//	}
//	public SudokuNumber[] fullCol (int rowNumber){
//		if(rowNumber <= 3){
//			return colAdder(rowNumber);
//		}
//		if(rowNumber<= 6){
//			return colAdder(rowNumber+3);
//		}else{
//			return colAdder(rowNumber+6);
//		}
//	}

}
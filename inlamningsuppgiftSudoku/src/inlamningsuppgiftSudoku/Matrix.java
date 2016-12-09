package inlamningsuppgiftSudoku;

public class Matrix {
	private SudokuNumber[][] matrix;

	/**
	 * Skapar en tom matris
	 */
	public Matrix() {

	}

	/**
	 * Skapar en matris med inneh�llet i vector. Matrisen fyller f�rst p� alla
	 * kolumner p� f�rsta raden och forts�tter sedan samma m�nster p� n�sta rad
	 * 
	 * @param vector
	 *            Vektorn med SudokuNumberobjekt som matrisen ska fyllas med
	 */
	public Matrix(SudokuNumber[] vector) {

	}
	
	
	/**
	 * Kollar om matrisen inneh�ller numret "number"
	 * 
	 * @param number
	 * numret som ska kollas
	 * @return
	 * Blir sann om matrisen inneh�ller number
	 */
	public boolean contains(Integer number){
		return false;
	}

	/**
	 * Returnerar en vektor med raden i matrisen som specificeras av "row"
	 * 
	 * @param row
	 * Specificerar vilken rad som ska returneras
	 * @return
	 * En vektor med SudokuNumberobjekt
	 */
	public SudokuNumber[] getRow(Integer row) {
		SudokuNumber[] rowVector = new SudokuNumber[3];		
		for (int i = 0; i<3; i++){
			rowVector[i] = matrix[row][i];
		}
		return rowVector;
	}
	
	/**
	 * Returnerar en vektor med kolumnen i matrisen som specificeras av "column"
	 * 
	 * @param col
	 * Specificerar vilken kolumn som ska returneras
	 * @return
	 * En vektor med SudokuNumberobjekt
	 */
	public SudokuNumber[] getCol(Integer col) {
		SudokuNumber[] colVector = new SudokuNumber[3];		
		for (int i = 0; i<3; i++){
			colVector[i] = matrix[i][col];
		}
		return colVector;
	}
	

}

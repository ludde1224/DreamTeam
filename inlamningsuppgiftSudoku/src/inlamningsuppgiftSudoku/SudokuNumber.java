package inlamningsuppgiftSudoku;

public class SudokuNumber {
	private int value;
	private boolean flag;
	
	/**
	 * Skapar ett Sudokunr med värdet value
	 * @param value Insatt värde
	 * @param flag True om värdet är insatt av användaren
	 */
	public SudokuNumber(int value, boolean flag){
		this.value = value;
		this.flag = flag;
		
	}

	/**
	 * Hämtar värdet från en ruta i Sudokut
	 * @return Returnerar det önskade värdet
	 */
	
	public int getValue(){
		return value;
	}
	
/**
 *  Sätter ett nytt värde i Sudokut 
 * @param value
 * @return Returnerar det gamla värdet
 */
	
	public int setValue(int value){
		this.value = value;	
		return this.value;
	}
	
/**
 * 
 * @return Returnerar true om värdet är insatt av användaren, annars false
 */
	public boolean getFlag(){
			return flag;
	}
	
	/**
	 * Flaggar ett Sudokunr
	 * @return Returnerar true om värdet är insatt av användaren
	 */
	public void setFlag(boolean flag){
		this.flag = flag;
		
	}

}

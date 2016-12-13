package sudokuUppgift;

import java.util.*;
import java.io.*;

public class SudokuReader {
	private Scanner scanner = null;
	private int counter = 0;
	
	
	public Sudoku read() {
		if(counter == 0){
			try

			{
				scanner = new Scanner(new File("SudokuBoards"));
			} catch (

			FileNotFoundException e)

			{
				System.out.println("Couldn't open file: SudokuBoards");
				System.exit(1);
			}
		}
			Sudoku table = new Sudoku();
			for (int row = 0; row < 9; row++) {
				for (int col = 0; col < 9; col++) {
					int nbr =  scanner.nextInt();
					if(nbr != 0){
						table.put(row, col, nbr);
					}
				}
			}
			scanner.nextLine();
			counter++;
			if(counter == 4){
				scanner.close();
				counter = 0;
			}
			return table;
	}
	public static void main(String[]args){
		SudokuReader red = new SudokuReader();
		red.read().printSudoku();
		
		red.read().printSudoku();
		red.read().printSudoku();
		red.read().printSudoku();
		red.read().printSudoku();
	}
}
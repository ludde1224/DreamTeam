package sudokuUppgift;

public class SudokuTest {
	public static void main(String[] args) {
		int[][] sudokuBoard = { { 0, 0, 8, 0, 0, 9, 0, 6, 2 }, // testfall 5
				                { 0, 0, 0, 0, 0, 0, 0, 0, 5 },
				                { 1, 0, 2, 5, 0, 0, 0, 0, 0 },
				                { 0, 0, 0, 2, 1, 0, 0, 9, 0 },
				                { 0, 5, 0, 0, 0, 0, 6, 0, 0 },
				                { 6, 0, 0, 0, 0, 0, 0, 2, 8 },
				                { 4, 1, 0, 6, 0, 8, 0, 0, 0 },
				                { 8, 6, 0, 0, 3, 0, 1, 0, 0 },
				                { 0, 0, 0, 0, 0, 0, 4, 0, 0 }, };
		Sudoku funkaNu = new Sudoku(sudokuBoard);
		if (funkaNu.solve()) {
			System.out.println("Was ok!");
			funkaNu.printSudoku();
			funkaNu.clear(); // testar clearfunktionen
			funkaNu.printSudoku();
		} else {
			System.out.print("Programmet funkar skitbra.......");
		}
		
		int[][] sudokuBoard1 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // testfall 1
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  }, };

		

		Sudoku funkaNu1 = new Sudoku(sudokuBoard1);
		if (funkaNu1.solve()) {
			System.out.println("Was ok!");
			funkaNu1.printSudoku();
		} else {
			System.out.print("Programmet funkar skitbra.......");
		}
		
		int[][] sudokuBoard2 = { { 1, 2, 3, 0, 0, 0, 0, 0, 0 },// testfall 3
                { 4, 5, 6, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 7, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0  }, };
Sudoku funkaNu2 = new Sudoku(sudokuBoard2);
if (funkaNu2.solve()) {
System.out.println("Was ok!");
funkaNu2.printSudoku();
} else {
System.out.print("Programmet funkar skitbra.......");
}

int[][] sudokuBoard3 = { { 1, 2, 3, 0, 0, 0, 0, 0, 0 }, // testfall 3
        { 4, 5, 6, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0  },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0  }, };
Sudoku funkaNu3 = new Sudoku(sudokuBoard3);
if (funkaNu3.solve()) {
System.out.println("Was ok!");
funkaNu3.printSudoku();
} else {
System.out.print("Programmet funkar skitbra.......");
}
	}

}

package recursion;

import java.util.ArrayList;

public class QueenProblem {
	
	private static final int DIMENSION = 8;

	public static void main(String[] args) {
		int[] columns = new int[DIMENSION];
		
		for (int i = 0; i < DIMENSION; i++){
			columns[i] = -1; // not necessary
		}
		
		ArrayList<int[]> result = new ArrayList<int[]>();	
		recursePossiblePositions(0, columns, result);
		showArray(result.get(50));
	}
	
	private static void recursePossiblePositions(int row, int[] columns, ArrayList<int[]> result) {
		if (row == DIMENSION){
			result.add(columns);
			return;
		}
		
		for (int column = 0; column < columns.length; column++){
			boolean isValid = checkVaildPosition(row, column, columns);
			
			if(isValid){
				columns[row] = column;
				recursePossiblePositions(row + 1, columns.clone(), result);
			}	
		}
	}

	private static boolean checkVaildPosition(int row, int col, int[] columns) {
		
		for (int row2 = 0; row2 < row; row2++){ // when row = 0, it would not execute
			// and return true
			// so all positions in row1 is valid
			int col2 = columns[row2];
			if (col == col2){
				return false; // already the column occupied, so not valid
			}
			
			if(Math.abs(col - col2) == Math.abs(row - row2)){
				// diagonal, so not possible
				return false;
			}
		}
		return true;
	}

	private static void showArray(int[] array){
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i] + " ");
		}
	}

}

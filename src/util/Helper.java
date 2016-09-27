package util;

public class Helper { 
	public static void printArray(int[] array){
		for (int i = 0; i < array.length - 1; i++){
			System.out.print(array[i] + ", ");
		}
		
//		System.out.println();
		
		System.out.println(array[array.length - 1]);
	}

}

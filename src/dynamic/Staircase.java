package dynamic;

public class Staircase {
	
	private static long[] arrayValues = new long[51];
	
	private static long stair(int i){
		if(i == 0){
			arrayValues[i] = 1;
			return arrayValues[i];
		}
		
		if (i == 1){
			arrayValues[i] = 1;
			return arrayValues[i];
		}
		
		if (i == 2){
			arrayValues[i] = 2;
			return arrayValues[i];
		}
		
		if (arrayValues[i] != 0){
			//System.out.println("inside here");
			return arrayValues[i];
		}
		
		arrayValues[i] = stair(i-1) + stair(i - 2) + stair(i - 3);
		return arrayValues[i];
	}
	public static void main(String[] args) {
		System.out.println(stair(50));

	}

}

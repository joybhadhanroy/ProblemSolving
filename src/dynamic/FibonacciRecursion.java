package dynamic;

public class FibonacciRecursion {

	static long[] fibValues = new long[51];
	private static long fibonacci(int i){
		if(i == 0){
			fibValues[0] = 1;
			return fibValues[0];
		} 
		
		if (i == 1){
			fibValues[1] = 1;
			return fibValues[1];
		}
		
		if (fibValues[i] != 0){
			return fibValues[i];
		}
		
		fibValues[i] = fibonacci(i-1)+fibonacci(i-2);
		return fibValues[i];
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(50));

	}

}

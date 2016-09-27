package recursion;

public class CoinProblem {

	private static int countCoinWays(int moneyValue, int coinValue){
		
		if(moneyValue == 0){
			return 1;
		}
		if(coinValue <= 0){
			return 0;
		}
		
		//int coinVA
		int iterationNumber = moneyValue/coinValue;
		int nextCoinValue = 0, numberOfWays = 0;
		
		if(coinValue == 25){
			nextCoinValue = 10;
		} else if(coinValue == 10){
			nextCoinValue = 5;
		} else if (coinValue == 5){
			nextCoinValue = 1;
		} else if(coinValue == 1){
			//nextCoinValue = 0;
			return 1; 
			// if the coinvalue is 1, then there is only one way to represent it
			// say value is 6, and coinvalue 1
			// then representation {1, 1, 1, 1, 1, 1}
		}
		
		System.out.println("CoinValue: " + coinValue);
		
		for (int i = 0; i <= iterationNumber; i++){
			numberOfWays +=  countCoinWays(moneyValue - (i*coinValue), nextCoinValue);
		}
		
		return numberOfWays;
		
	}
	public static void main(String[] args) {
		
		//System.out.println("i is: " + i);
		System.out.println("Number of ways: " + countCoinWays(10, 25));
		
		// example
		// f(10, 25) -> f(10, 10) 
		// -> f(10, 5) + f(0, 5)
		// -> f(10, 1) + f(5, 1) + f(0, 1) + 1
		
	}

}

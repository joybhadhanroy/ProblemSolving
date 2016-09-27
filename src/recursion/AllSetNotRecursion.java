package recursion;

import java.util.ArrayList;

public class AllSetNotRecursion {
	
	public static void main(String[] args) {
		char[] set = {'a', 'b', 'c', 'd'};
		ArrayList<ArrayList<Character>> allSets = new ArrayList<ArrayList<Character>>();
		generateAllSets(set, allSets);
		//System.out.println(set);
		//printCharArray(set);
	}
	
	private static void generateAllSets(char[] set, ArrayList<ArrayList<Character>> allSet) {
		int setSize = set.length;
		int subSetNumber = 1 << setSize;
		//System.out.println(subSetNumber);
		for (int i = 0; i < subSetNumber; i++){
			generatecurrentSet(i, set, allSet);
		}
		
		System.out.println(allSet);
		
	}

	private static void generatecurrentSet(int value, char[] set, ArrayList<ArrayList<Character>> allSet) {
		ArrayList<Character> tempset = new ArrayList<Character>();
		int index = 0;
		//System.out.println("Value is: " + value);
		for (int i = value; i > 0; i >>=1 ){
			//System.out.print("i s is: " + i);
			int val = (i & 1);
			//System.out.println(val);	
			if (val == 1){
				tempset.add(set[index]);
			}
			
			index++;
		}
		
		//System.out.println();
		allSet.add(tempset);
		
	}

	private static void printCharArray(char[] array){
		for (int i = 0; i < array.length; i++){
			//System.out.println(array[i]);
			System.out.println(array[i]);
		}
	}

}

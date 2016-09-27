package recursion;

import java.util.ArrayList;

public class AllSets {

	public static void main(String[] args) {
		ArrayList<ArrayList<Character>> allSet = new ArrayList<ArrayList<Character>>();
		
		ArrayList<Character> emptyOne = new ArrayList<Character>();
		
		//ArrayList<Character> nextOne = new ArrayList<Character>();
		//nextOne.add('a');
		
		allSet.add(emptyOne);
		//allSet.add(nextOne);
		
		//System.out.println(allSet.size());
		
		char[] inputChar = {'a', 'b', 'c'};
		
		generateAllSets(0, inputChar, allSet);
		
		for (int i = 0; i< allSet.size(); i++){
			System.out.println(allSet.get(i));
		}
		
		

	}

	private static void generateAllSets(int index, char[] inputChar, ArrayList<ArrayList<Character>> allSet) {
		if (index >= inputChar.length){
			return;
		}
		
//		System.out.println("index is: " + index);
		
		//System.out.println(inputChar.length);
		char ch = inputChar[index];
		
		ArrayList<Character> tempList;
		
		int lnth = allSet.size();
		System.out.println("lnth is: " + lnth);
		for (int i = 0; i < lnth; i++){
			tempList = (ArrayList<Character>) allSet.get(i).clone();
			//System.out.println(tempList);
			tempList.add(ch);
			allSet.add(tempList);
		}
		
		generateAllSets(index + 1, inputChar, allSet);
	}

}

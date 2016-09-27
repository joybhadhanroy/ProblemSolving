package sortsearch;

public class sortSearchQuestion5 {

	public static void main(String[] args) {
		String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "",""};
		
		String str = "dada";
		System.out.println(str.compareTo("at"));
		
		//System.out.println(array[4]);
		int index = binarySearchRecursive(array, str, 0, array.length-1);
		if(index == 0){
			if(array[index] != str){
				index = -1;
			}
		}
		System.out.println("index is: " + index);

	}
	
	private static int binarySearchRecursive(String[] array, String str, int low, int high){
		if(low > high){
			return 0;
		}
		
		int middle = (low+high)/2;
		
		if(array[middle] == ""){
			return binarySearchRecursive(array, str, low, middle - 1) + binarySearchRecursive(array, str, middle+1, high);
		} else if(str.compareTo(array[middle]) > 0){
			return binarySearchRecursive(array, str, middle+1, high);
		} else if (str.compareTo(array[middle]) < 0){
			binarySearchRecursive(array, str, low, middle - 1);
		} else {
			return middle;
		}
		
		
		return 0;
		
	}

}

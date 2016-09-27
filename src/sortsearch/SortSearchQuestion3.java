package sortsearch;

public class SortSearchQuestion3 {
	public static void main(String[] args) {
		int[] array = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		int value = 5;
		
		System.out.println(binarySearch(array, value));
		

	}
	
	private static int binarySearch(int[] array, int value){
		
		int low = 0, high = array.length - 1;
		int mid;
		
		while(low <= high){
			mid = (low + high)/2;
			
			if (array[low] > value && array[mid] < value){
				high = mid - 1;
			} else if (array[low] < value && array[mid] > value){
				high = mid -1;
			} else if (array[mid] == value){
				return mid;
			} else {
				low = mid+1;
			}
		}
		
		return -1;
		
	}
}

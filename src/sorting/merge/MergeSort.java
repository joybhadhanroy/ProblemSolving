package sorting.merge;

public class MergeSort {
	
	public void mergesort(int[] array){
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length-1);
	}
	
	
	private void mergesort(int[] array, int[] helper, int low, int high) {
		if(low < high){
			int mid = (low+high)/2;
			mergesort(array, helper, low, mid);
			mergesort(array, helper, mid+1, high);
			merge(array, helper, low, mid, high);
		}
	}


	private void merge(int[] array, int[] helper, int low, int mid, int high) {
		// copy values of array to helper
		for (int i = low; i<=high; i++){
			helper[i] = array[i];
		}
		
		int lowLeft = low;
		int highLeft = mid+1;
		int current = low;
		
		// swapping
		while(lowLeft <= mid && highLeft <= high){
			if(helper[lowLeft] < helper[highLeft]){
				array[current++] = helper[lowLeft++];
			} else {
				array[current++] = helper[highLeft++];
			}
		}
		
		// copying leftover stuff
		int remaining = mid - lowLeft;
		
		for (int i = 0; i<=remaining; i++){
			array[current + i] = helper[lowLeft + i];
		}
		
		
	}


	public static void main(String[] args) {
//		int i = (0+1)/2;
//		System.out.println("i is: " + i);
		int[] arr = {100, 2, 7, 5, 3, 4, 6, 8};
		MergeSort mergesort = new MergeSort();
		
		mergesort.mergesort(arr);
		
		printArray(arr);
	}
	
	private static void printArray(int[] anArray){
		for (int i = 0; i < anArray.length; i++){
			System.out.print(anArray[i] + ", ");
		}
		System.out.println();
	}
 
}

package sorting.quick;

import util.Helper;

public class QuickSort {
	
	void quicksort(int[] array){
		quicksort(array, 0, array.length - 1);
	}

	private void quicksort(int[] array, int low, int high) {
		if (low < high){
			int pindex = partition(array, low, high);
			quicksort(array, low, pindex-1);
			quicksort(array, pindex+1, high);
		}
		
	}

	private int partition(int[] array, int startIndex, int pivotIndex) {
		while(startIndex < pivotIndex){
			if(array[startIndex] <= array[pivotIndex]){
				startIndex++;
			} else {
				int temp1 = array[startIndex];
				//int temp2 = array[pivotIndex];
				array[startIndex] = array[pivotIndex - 1];
				int temp2 = array[pivotIndex];
				array[pivotIndex] = temp1;
				array[pivotIndex - 1] = temp2;
				pivotIndex--;
			}
		}
		
		return pivotIndex;
	}

	public static void main(String[] args) {
		int[] arr = {100, 2, 7, 5, 3, 8, 6, 4};
		QuickSort quickSort = new QuickSort();
		
		quickSort.quicksort(arr);
		
		Helper.printArray(arr);
		

	}

}

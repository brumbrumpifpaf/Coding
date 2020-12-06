package studia;
import java.util.Arrays;
public class SelectionSort {
	//finds index of min value
	public static int findMinValue (int[] arr, int start) {
		int arr_len = arr.length;
		int min = 0;
		int minIndex = start;
		min = arr[start];
		for (int i = start + 1; i <= arr_len; i++) {
			//min = arr[i];
			if (min >= arr[i - 1]) {
				min = arr[i - 1];
				minIndex = i - 1;
			}
		}
		//System.out.println(minIndex);
		
		return (minIndex);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 8, 17, 2, 7, 9, 1, 10};
		int length_arr = arr.length;
		int temp;
		int minIndex;
		for (int i = 0; i < length_arr; i++) {
			minIndex = findMinValue(arr, i); //index of min = 6
			System.out.println(minIndex);
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		//System.out.println(Arrays.toString(arr));
		

	}

}

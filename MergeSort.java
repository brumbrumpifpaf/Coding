package studia;
import java.util.ArrayList;
public class MergeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input array
		int arr[] = {3, 8, 2, 10, 20, 6, 5, 1};
		//sorting first half
		int temp;
		for (int i = 1; i < arr.length/2; i++) {
			if (arr[i] >= arr[i-1]) {
				continue;
			} else {
				temp = arr[i];
				for (int j = i-1; j >= 0; j--) {
					if (temp < arr[j]) {
						arr[j + 1] = arr[j];
					} else {
						arr[j + 1] = temp;
						break;
					}
					if (j == 0) {
						arr[j] = temp;
					}
				}
			}
		}
		//sorting second half
		int temp1;
		for (int i = arr.length/2+1; i < arr.length; i++) {
			if (arr[i] >= arr[i-1]) {
				continue;
			} else {
				temp1 = arr[i];
				for (int j = i-1; j >= arr.length/2; j--) {
					if (temp1 < arr[j]) {
						arr[j + 1] = arr[j];
					} else {
						arr[j + 1] = temp1;
						break;
					}
					if (j == arr.length/2) {
						arr[j] = temp1;
					}
				}
			}
		}
		//printing pre-sorted array
		System.out.println("Pre-sorted array: ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + ", ");
		}
		System.out.println();
		//creating ArrayList in order to contain new merged array
		ArrayList<Integer> mergedArr = new ArrayList<Integer>(arr.length);
		int first = 0;
		int second = arr.length/2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[first] < arr[second]) {
				mergedArr.add(i, arr[first]);
				first++;
				//if first half is empty - fill mergedArr
				//with values from second half
				if (first == arr.length/2) {
					while(i+1 < arr.length) {
						mergedArr.add(i+1, arr[second]);
						second++;
						i++;
					}
				}
			} else {
				mergedArr.add(i, arr[second]);
				second++;
				//if second half is empty - fill mergedArr
				//with values from first half
				if (second == arr.length) {
					while(i+1 < arr.length) {
						mergedArr.add(i+1, arr[first]);
						first++;
						i++;
					}
				}
			}
		}
		System.out.println("Merged array: "  + mergedArr);
		
		
		

	}

}

package studia;

public class SortingInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		int arr[] = {887, 3, 1335, 1723, 57, 9843, 31, 4103};
		int length_arr = arr.length;
		int temp;
		for (int i = 1; i < length_arr; i++) {
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
		for (int k = 0; k < length_arr; k++) {
			System.out.println(arr[k]);
		}
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println(elapsedTime);
		

	}

}

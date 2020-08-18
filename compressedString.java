public static void printCompressedString (String word) {
		char[] wordArray = word.toCharArray();
		ArrayList<Character> compressedString = new ArrayList<Character>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < wordArray.length; i++) {
			try {
				while (wordArray[i] == wordArray[i + 1]) {
					i = i + 1;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
			}
			compressedString.add(wordArray[i]);
			numbers.add(i+1);
		}
		for (int j = numbers.size() - 1; j >= 0; j--) {
			try {
			int temp = numbers.get(j);
			temp = temp - numbers.get(j - 1);
			numbers.remove(j);
			numbers.add(j, temp);
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}
		int arraySize = numbers.size();
		if (arraySize*2 >= wordArray.length) {
			System.out.println(wordArray);
		} else {
			for (int k = 0; k < arraySize; k++) {
				System.out.print(compressedString.get(k));
				System.out.print(numbers.get(k));
			}
			System.out.println();
		}
	}

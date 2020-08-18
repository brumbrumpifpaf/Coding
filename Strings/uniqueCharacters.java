public static boolean allUnique (String word) {
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	char[] chars = word.toCharArray();
	for (char c: chars) {
		int check = map.getOrDefault(c, 0);
		if (check == 0) {
			map.put(c, 1);
		} else {
			return false;
		}
	}
	return true;
}

public static void permut (String word, HashMap<Character, Integer> map) {
		char[] chars = word.toCharArray();
		for (char w: chars) {
			if (!map.containsKey(w)) {
				map.put(w, 1);
			} else {
				map.put(w, map.get(w) + 1);
			}
		}
		System.out.println(map);
	}
	
public static void permut2 (String word, HashMap<Character, Integer> map) {
	char[] chars = word.toCharArray();
	for (char w: chars) {
		if (!map.containsKey(w)) {
			map.put(w, -1);
		} else {
			map.put(w, map.get(w) - 1);
		}
		if (map.get(w) == 0) {
			map.remove(w);
		}
	}
	System.out.println(map);
}

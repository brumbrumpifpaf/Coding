package studia;

public class MissingBrackets {
	
	public static String fun(String input) {
		int paraCounter = 0; //counts brackets ')'
		int blockCounter = 0; // counts blocks "( 5 + 8 )"
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char[] arr = input.toCharArray();
			char ch = arr[i];
			
			if (ch == ')') {
				paraCounter++;
			}
			if (ch == '*' || ch == '/') {
				if (blockCounter == 1) {
					output = " (" + output;
					blockCounter = 0;
					paraCounter--;
				}
				output = " (" + output;
				blockCounter++;
				paraCounter--;
			}
			output = ch + output;
		}
		String oB = "( ";
		String repeated = new String(new char[paraCounter]).replace("\0", oB) + output;
		return repeated;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )"));
		System.out.println(fun("1 + 2 ) * 3 - 4 ) )"));
		System.out.println(fun("5 + 8 ) / 1 + 2 ) / 3 - 4 ) * 5 - 6 ) ) )"));
		System.out.println(fun("1 + 2 )"));
		System.out.println(fun("1 + 2 ) * 3 - 4 )"));

	}

}

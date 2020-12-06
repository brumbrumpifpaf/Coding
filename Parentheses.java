package studia;
import java.util.*;

public class Parentheses {
	
	public static void idk(String brackets) {
		Stack<Character> st = new Stack<Character>();
		char[] arr = brackets.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				st.push(arr[i]);
			}
			if (arr[i] == ')') {
				if (st.peek() == '(') {
					st.pop();
				} else {
					System.out.println(":(");
					break;
				}
			}
			if (arr[i] == '[') {
				if (st.contains('(')) {
					System.out.println(":(");
					break;
				} else st.push(arr[i]);
			}
			if (arr[i] == ']') {
				if (st.peek() == '[') {
					st.pop();
				} else {
					System.out.println(":(");
					break;
				}
			}
			if (arr[i] == '{') {
				if (st.contains('(') || st.contains('[')) {
					System.out.println(":(");
					break;
				} else st.push(arr[i]);
			}
			if (arr[i] == '}') {
				if (st.peek() == '{') {
					st.pop();
				} else {
					System.out.println(":(");
					break;
				}
			}
		}
		if (st.isEmpty()) {
			System.out.println("All good.");
		} else System.out.println("Not good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		idk("{[[()()]]}{}()");
		idk("{[[()()]}{}(");
		idk("{[}]");
		idk("(()){()[()]}");
		
	}
	

}


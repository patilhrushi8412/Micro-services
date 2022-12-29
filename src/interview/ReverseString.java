package interview;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Nitina";
		String d = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			d = d + s.charAt(i);
		}
		if (s.equalsIgnoreCase(d)) {
			System.out.println("Palindrome String : " +s);
		}
		else {
			System.out.println("Not Palindrome String : " +s);
		}
	}
}

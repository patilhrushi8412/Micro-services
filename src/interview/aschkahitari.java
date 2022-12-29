package interview;

public class aschkahitari {

	public static void main(String[] args) {
		char[] s= {'a','b','c','d'};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j <= i+1; j++) {
				System.out.print(s[i]+" ");
			}
		}
	}
}

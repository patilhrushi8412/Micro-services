package interview;

public class Singolton {

	static Singolton singleton;
	
	private Singolton() {
		singleton=new Singolton();
	}
	
	public static Singolton object() {
		return new Singolton();
	}
	public static void main(String[] args) {
		Singolton object = Singolton.object();
		System.out.println(object);
	}
}

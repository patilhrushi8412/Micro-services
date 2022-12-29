package interview;

import java.util.Iterator;

public class Threading extends Thread{

	public static void main(String[] args) throws InterruptedException {

		Thread t=new Thread();
		
		for (int i = 0; i < 14; i++) {
			System.out.println("Hellow");
			t.sleep(1500);
		}
		
	}
}
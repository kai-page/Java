/**
 * Baseball.java
 * インターフェースについて
 * @author KAI
 */

package interface1;

public class Baseball implements English{
	
	public void display() {
		System.out.println("ランニング");
		System.out.println("キャッチボール");
		System.out.println("バッティング");
	}
	
	public void dispEng() {
		System.out.println(English.LANGUAGE);
		System.out.println("running");
		System.out.println("catch ball");
		System.out.println("batting");
	}

}

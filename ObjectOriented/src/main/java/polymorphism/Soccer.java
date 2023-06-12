/**
 * Soccer.java
 * 抽象クラスとポリモフィズムについて
 * @author KAI
 */

package polymorphism;

public class Soccer extends Club {
	
	public Soccer(String name) {
		super(name);
	}
	
	public void practice() {
		System.out.println("ランニング");
		System.out.println("シュート練習");
		System.out.println("ミニゲーム");
	}

}

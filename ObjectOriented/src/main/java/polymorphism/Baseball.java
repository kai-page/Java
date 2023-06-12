/**
 * Baseball.java
 * 抽象クラスとポリモフィズムについて
 * @author KAI
 */

package polymorphism;

public class Baseball extends Club{
	
	public Baseball(String name) {
		super(name);
	}
	
	public void practice() {
		System.out.println("ランニング");
		System.out.println("キャッチボール");
		System.out.println("バッティング");
	}

}

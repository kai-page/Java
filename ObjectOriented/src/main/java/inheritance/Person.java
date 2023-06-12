/**
 * Person.java
 * 継承について
 * @author KAI
 */

package inheritance;

public class Person {
	
	private String name; // 名前
	private int age; // 年齢
	
	// コンストラクタでメンバ変数の初期化を行う
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 名前と年齢を表示するメソッド
	public void display() {
		System.out.println("名前: " + name);
		System.out.println("年齢: " + age);
	}
	
}

/**
 * Student.java
 * 継承について
 * @author KAI
 */

package inheritance;

public class Student extends Person {
	
	private String school; // 学校名

	// コンストラクタでメンバ変数の初期化を行う
	public Student(String name, int age, String school) {
		// スーパークラス(Personクラス)のコンストラクタを呼び出す
		super(name, age);
		this.school = school;
	}
	
	// 生徒の情報を表示するメソッド
	public void display() {
		// スーパークラス(Personクラス)のdisplayメソッドを呼び出す
		super.display();
		System.out.println("学校: " + school);
	}
	
	
}

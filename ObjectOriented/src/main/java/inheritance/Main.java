/**
 * Main.java
 * 継承について
 * @author KAI
 */

package inheritance;

public class Main {
	public static void main(String[] args) {
		
		// Personクラスを実装
		Person person = new Person("AAA", 17);
		// Personクラスのdisplayメソッドを呼び出す
		person.display();
		
		// Studentクラスを実装
		Student stu1 = new Student("BBB", 16, "XXX");
		// Studentクラスのdisplayメソッドを呼び出す
		stu1.display();
		
	}
}

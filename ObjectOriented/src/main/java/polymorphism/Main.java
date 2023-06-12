/**
 * Main.java
 * 抽象クラスとポリモフィズムについて
 * @author KAI
 */

package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		Baseball baseball = new Baseball("野球部");
		Soccer soccer = new Soccer("サッカー部");
		
		Student stu1 = new Student("AAA", baseball);
		stu1.display();
		stu1.practice();
		
		Student stu2 = new Student("BBB", soccer);
		stu2.display();
		stu2.practice();
		
	}

}

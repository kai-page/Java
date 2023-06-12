/**
 * Student.java
 * インターフェースについて
 * @author KAI
 */

package interface1;

public class Student implements English {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("名前: " + name);
	}
	
	public void dispEng() {
		System.out.println(English.LANGUAGE);
		System.out.println("Name: " + name);
	}

}

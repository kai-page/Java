package inheritance;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("名前: " + name);
		System.out.println("年齢: " + age);
	}
	
}

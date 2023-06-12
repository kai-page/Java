package inheritance;

public class Student extends Person {
	
	private String school;

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	public void display() {
		super.display();
		System.out.println("学校: " + school);
	}
	
	
}

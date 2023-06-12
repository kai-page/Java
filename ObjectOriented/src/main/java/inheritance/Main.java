package inheritance;

public class Main {
	public static void main(String[] args) {
		
		Person person = new Person("AAA", 17);
		person.display();
		
		Student stu1 = new Student("BBB", 16, "XXX");
		stu1.display();
		
	}
}

package om;

public class Main {
	
class person{
	String name;
	int age;
	
	public void displayDetails() {
		System.out.println("Name"+ name);
		System.out.println("age"+ age);
	}
}

class Student extends person{
	String studentID;
}

	public void displayStudentInfo() {
		
		displayDetails();
		Sytem.out.println("student Id" + student id);
	}
	public void Main() {
		
		public static void main(String[] args) {
			Student obj = new Student();
			obj.name = "Alice";
			obj.age = 25;
			obj.studentID = ("DY patil university");
			obj.displayStudentInfo();
		}
		// TODO Auto-generated constructor stub
	}

}

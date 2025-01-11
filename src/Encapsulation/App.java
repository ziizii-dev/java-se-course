package Encapsulation;

public class App {

	public static void main(String[] args) {
		Student student =  getStudentInfo();
		System.out.println("Name: " + student.getName());
		System.out.println("RollNo: " + student.getRollNo());

		
		
	}
	
	public static Student getStudentInfo() {
		int rollNo = 89;
		String name = "Mg Mg";
		
		//Single unit
		//data type change to parent data type ,in this Student
		//this is also use like constructor without using getter ,setter
		Student student = new Student();
		student.setRollNo(rollNo);
		student.setName(name);
		return student;
	}

}

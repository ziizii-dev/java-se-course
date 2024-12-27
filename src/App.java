
public class App {

	public static void main(String[] args) {
		Student.count = 20;
		Student.count =30;
	System.out.println("Count:" + Student.count);
 
		Student student = new Student();
		student.id = 10;
		student.name = "Mg Mg";
		student.introduce();
		
		Student student_2 = new Student();
		
		student_2.id =11;
		student_2.name="Kyaw Kyaw";
		
		student_2.introduce();
		Student.showCount();
		int num = Integer.parseInt("12");  //static method
		//static တွေက class နဲ့သက်ဆိုင်တယ်/ static မဟုတ်တာက မသက်ဆိုင်လို့ new instance တည်ဆောက်မှရမယ်/ static တွေကို class ကနေ တိုက်ရိုက်သုံးလို့ရ
		//constructure
		Employment employment = new Employment(12);
		
//		Inheritance lesson
		Car car = new Car();
		car.start();
		car.stop();
		car.carStop();
	}
	


}

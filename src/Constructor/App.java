package Constructor;

public class App {

    public static void main(String[] args) {
        Student student = getStudentInfo();
        System.out.println("Name: " + student.getName());
        System.out.println("RollNo: " + student.getRollNo());
    }

    public static Student getStudentInfo() {
        int rollNo = 809;
        String name = "Mg Mgoo";

        // Using the constructor of Student to initialize the object
        return new Student(rollNo, name);
    }
}

package Gettr_and_setter;

public class Student {
	private int id ;
	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		};
	}
	public int getId(){
		return id;
	}
	//setter getter is a method ,it can validate in this program

}

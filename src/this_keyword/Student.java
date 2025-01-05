package this_keyword;

public class Student {
	String name ;
	
	public void showInfo(String name) {
	//	String name = "Tun Tun";  //local variable , class will prior to local class but "this" will be indicated to the superior object;
		//System.out.println(name);

		System.out.println(this.name);
		
	}

}

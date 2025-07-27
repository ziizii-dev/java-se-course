package Data_Object_Stream;

import java.io.Serializable;

public class Students implements Serializable {
	
	
	
	private static final long serialVersionUID = 2468L;
	int id;
	String name;
	
	
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}

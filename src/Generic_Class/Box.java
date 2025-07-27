package Generic_Class;

public class Box<CustomDataType> {
	
	private CustomDataType value;
	
	public void set(CustomDataType value) {
		 
		this.value = value;
		
		
	}
	public CustomDataType get() {
		return value;
		
	}

}

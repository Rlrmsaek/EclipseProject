package level;

public class CASTINGS {
	
	// WIDENING METHOD
	public void widden() {
		int wide1=100;
	    long wide2=wide1;
		System.out.println(wide2);
	}
	//NARROWING METHOD
	public void narrow() {
		double row1=100.5000;
		float row2=(float)row1;
		System.out.println(row2);
	}
	public static void main(String[] args) {
		CASTINGS object=new CASTINGS();
		object.widden();
		object.narrow();
		
	}
	
}

package edison;

public class METHODS {
	public METHODS() {
		//this(5);
		
	}
	public METHODS(int x) {
		this();
		System.out.println(x);
		
	}
	public METHODS(int x,int y) {
		this(5);
		System.out.println(x*y);
		
	}
	public static void main(String[] args) {
		new METHODS(5,10);
		
	}
}

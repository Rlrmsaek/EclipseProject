package edison;

public class SON extends APPA{

public void work(String name) {
		System.out.println("MY WORK IS " +name);	
	}
	public static void main(String[] args) {
		APPA object2=new SON();
		object2.work("CHENNAI",10000);
		object2.work("CHENNAI",10000,20000);
		object2.work("ENGINEER");
	}
}

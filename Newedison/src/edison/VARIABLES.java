package edison;

public class VARIABLES {
	int g=10;
	int e;
		
	void LOCAL(int c,int d) {
		int e =30;
		System.out.println(c-d+this.e);
		System.out.println(g);
	}
	public static void main(String[] args) {
		VARIABLES object = new VARIABLES();
		object.LOCAL(10,10);
	}
}
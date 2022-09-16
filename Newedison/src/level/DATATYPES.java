package level;

public class DATATYPES {
	byte a=100;
	short b=200;
	int c=30000;
	long god=4000000000l;
	float h=555.55f;
	double k=66666.6666;
	
	public void datatype() {
	System.out.println(a+b);
	System.out.println(b+c);
	System.out.println(c-b);
	}
		public static void main(String[] args) {
			DATATYPES object=new DATATYPES();
			object.datatype();	
			
		}
}

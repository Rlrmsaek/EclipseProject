package edison;

public class RETURN_TYPE {
String name(){
	//System.out.println("name");
	return ("EDISON");			
}
 int age(){
	//System.out.println("age1");
    return (24);
}
long PHnum() {
	//System.out.println("PHnum");
	return(123456789);	
}
public static void main(String[] args) {
	RETURN_TYPE detail=new RETURN_TYPE();
	String detail1=detail.name();
	System.out.println(detail1);
	int detail2=detail.age();
	System.out.println(detail2);
	long detail3=detail.PHnum();
	System.out.println(detail3);
}
}

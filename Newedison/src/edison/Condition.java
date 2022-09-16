package edison;

public class Condition {
	
public static void main(String[] args) {
	int aadhar=100;
	if (aadhar<=18) {
		System.out.println("not eligible FOR EXAM ");
	}
	else if (aadhar>18 || aadhar<35 ) {
		System.out.println("eligible to exam");
	}
	else
	{
		System.out.println("eligible for only one exam");
		
	}
}
}



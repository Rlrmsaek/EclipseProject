package edison;

public class Person {

	public void eat() {
		int a=10;
		int b=10;
		System.out.println(a+b);
		}

public static void sleep() {	
	int c=20;
	int d=20;
	System.out.println(c+d);
}
public static void main(String[] args) {
	Person boy=new Person();
	boy.eat();
	sleep();
}
}


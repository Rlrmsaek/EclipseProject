package edison;

public class Learner {
public Learner(int c) {
	this.c=c;
}
public Learner(int c,float d) {
	this.c=c;
	this.d=d;
}
byte a;
short b;
int c;
float d;
boolean e;

//public Learner(int a,short b,int c,float d,boolean e) {
	//this.a=a;
void data(){		
	//System.out.println(a);
	//System.out.println(b);
	System.out.println(c);

	System.out.println(c+d);
/////////////////////System.out.println(e);
}
public static void main(String[] args) {
	Learner data=new Learner(2);
	data.data();
	Learner data1 =new Learner(4,4.41f);
data.data();
}
}

package level;

public class Array {
     
	public static void main(String[] args) {
		   
		int X[]=new int [4];
		X[0]=5;
		X[1]=6;
		X[2]=7;
		X[3]=8;
		
		for (int i=0;i<4;i++) {
	        int Y=0;
			while(Y<i){
				
				System.out.print(X[Y]);
				//System.out.println();
				Y++;
		     
		}   
			System.out.println();
	}
}
}
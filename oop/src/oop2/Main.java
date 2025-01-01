package oop2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		A[] ar = new A[2];
		
		ar[0]= new B(5, 6);
		ar[1]= new C(7,8);
		
		for(int i=0;i<ar.length;i++) {
		      int x =	ar[i].Calculate();
			  System.out.println(x);
		}
		
		
	

	}

}

package oop7;

public class Main {

	public static void main(String[] args) {
		
		Vahicale car = new Car();
		Vahicale Bus = new Bus();
		Vahicale Lorry = new Lorry();
		
		Vahicale[] ar = new Vahicale[3];
		ar[0]=car;
		ar[1]=Bus;
		ar[2]=Lorry;
		
		for(int i=0; i<ar.length;i++) {
			ar[i].park();
			ar[i].cheackfuel();
		}

	}

}

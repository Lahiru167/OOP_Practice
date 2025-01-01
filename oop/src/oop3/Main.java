package oop3;

public class Main {
	
	public static void main(String [] args) {
		
		Animal [] ar = new Animal[3];
		
		ar[0]= new Dog();
		ar[1]=new Fish();
		ar[2]= new Bird();
		
		for(int i=0;i<ar.length;i++) {
			
		 	ar[i].move();
		}
	}

}

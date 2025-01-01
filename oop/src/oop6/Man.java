package oop6;

public class Man {

	public static void main(String[] args) {
		
		Animal Dog = new Dog();
		Animal Cat = new Cat();
		Animal Fish = new Fish();
		Animal Bird = new Bird();
		
		Animal[] ar = new Animal[4];
		
		ar[0]=Dog;
		ar[1]=Cat;
		ar[2]=Fish;
		ar[3]=Bird;
		
		for(int i =0;i<ar.length;i++) {
			
			ar[i].move();
		}
		

	}

}

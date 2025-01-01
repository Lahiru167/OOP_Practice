package oop2;

public class B extends A {
	public B(int x, int y) {
		super(x,y);
		System.out.println("Constructor called"+ x+" :"+y);
		
	}
	
	@Override
	public int Calculate() {
		int total = getX()+getY();
		total =total+20;
		return total;
	}


}

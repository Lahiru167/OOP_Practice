package oop2;

public class C extends A {
	
	public C(int x, int y) {
		super(x,y);
		System.out.println("Constructor called"+ x+" :"+y);
	}
	
	@Override
	public int Calculate() {
		int total = getX()+getY();
		total =total+10;
		return total;
	}

}

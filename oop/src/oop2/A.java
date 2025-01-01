package oop2;

public class A {
	
	private int x;
	private int y;
	
	public A(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int Calculate() {
		int total = this.x+this.y;
		return total;
	}

}

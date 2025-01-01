package oop;

public class Car {
  private	String brand;
  private	int setCount;
  private	String color;
  private	String number;
  
  
  public Car() {
	  
  }
	
	public Car(String brand, int setCount, String color,String number) {
		this.brand=brand;
		this.setCount=setCount;
		this.color=color;
		this.number=number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSetCount() {
		return setCount;
	}

	public void setSetCount(int setCount) {
		this.setCount = setCount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

}

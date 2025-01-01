package oop1;

public class Car {
	private int seatCount;
	private String brand;
	private String color;
	
	public Car(int seatCount,  String brand,String color) {
		this.seatCount=seatCount;
		this.brand = brand;
		this.color =color;
	}
	public Car(int seatCount,  String brand) {
		this.seatCount=seatCount;
		this.brand = brand;
	}
	
	public Car() {
		
	}
	public void  setSeatCount(int seatCount) {
		this.seatCount=seatCount;
	}
	
	public int getSeatCount() {
		return this.seatCount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}

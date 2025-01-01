package oop1;

public class NormalCar extends Car {
	private  String fuleType;
	
	
	
	public NormalCar() {
		
	}
	
	public NormalCar(int seatCount, String brand, String fuleType,String color) {
		super(seatCount ,brand,color);
		this.fuleType=fuleType;
	}

	public String getFuleType() {
		return fuleType;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	
	
	
	

}

package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new NormalCar(4,"Toyota","octan-95","Black");
		Car car2 = new ElectricCar(4,"Honda","Black");
		
		
		System.out.println(car1.getBrand());
		System.out.println(car2.getBrand());

	}

}

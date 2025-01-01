package oop;

public class Student {
  private	String id;
  private	String name;
  private	String address;
  private	int age;
	
	public Student(String id, String name, String address,int age) {
		this.id =id;
		this.name =name;
		this.address=address;
		this.age=age;
		
	}
	
	public void setId(String id) {
		this.id =id;
	}
	public String getId() {
		return this.id;
	}

}

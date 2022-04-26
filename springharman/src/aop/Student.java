package aop;

public class Student {
	int id;
	String name;
	int age;
	public int getId() {
		System.out.println("Getting Id : ");

		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("Getting Name : ");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("Getting Age : ");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

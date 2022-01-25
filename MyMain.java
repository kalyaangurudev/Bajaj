package com.bajaj.day2;


//POJO --plain old java object
//Model class


//hold the data of person
class Person
{
	
@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
public Person(String name, int age, int salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

private String name;
private int age;
private int salary;
private String address;


}


public class MyMain {
	
	public static void main(String args[])
	{
		Person ansar=new Person("Ansar", 35, 10000, "Chennai");
		System.out.println(ansar.toString());
		
		Person ajay=new Person("Ajay", 10, 5000, "Chennai");
		System.out.println(ajay.toString());
	}

}

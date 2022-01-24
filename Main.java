package day2;

class Person 
{
	@Override
	public String toString() {
		 return "Person [name=" + name + ", age=" + age + ", salaray=" + salaray + ", address=" + address + "]";
	}
	public Person(String name, int age, int salaray, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salaray = salaray;
		this.address = address;
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
	public int getSalaray() {
		return salaray;
	}
	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;
	private int age;
	private int salaray;
	private String address;
	
}
public class Main 
{
	public static void main(String a[])
	
	{
		Person test=new Person("kalyaan",20,10000,"CBE");
		System.out.println(test.toString());
		
	}
}

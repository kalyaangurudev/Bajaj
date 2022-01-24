package day2;
import java.util.*;
public class helloworld extends hi
{
	
	public void set(String a,String b,int c,String d,String e)
	{
		this.name=a;
		this.std=b;
		this.age=c;
		this.subject=d;
		this.school=e;
		System.out.println("details added!");
	}
	public void get()
	{
		
		System.out.println(name);
		hey();
	}
	
	String name;
	String std;
	int age;
	String subject;
	String school;
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		String name;
		String std;
		int age;
		String subject;
		String school;
		helloworld c=new helloworld();
		
		do {
			System.out.println("1.Set        2.Get");
			int f=sc.nextInt();
			if(f==1)
				
			{
				System.out.println("input name,class,age,subject,school");
				name=sc.next();
				std=sc.next();
				age=sc.nextInt();
				subject=sc.next();
				school=sc.next();
				
				c.set(name,std,age,subject,school);
			}
			else
			{
				c.get();
			}
			i=sc.nextInt();
		}
		while(i==0);
		
		
	}
}

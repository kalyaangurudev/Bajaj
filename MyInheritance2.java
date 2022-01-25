package com.bajaj.day2;

//why object cannot 

//no direct access 

//small component 
//raw component

//abstract method
//which do not have body

//mobile --camera , processor
//interface

//usb charging  -
//abstract class--






//Abstraction-- to provide the abstraction -
//interface
//abstract class

class camera
{
	
	public void printCamera()
	{
		System.out.println("5 MP");
	}
}
//every method in the interface is abstract method
abstract interface processor
{

	abstract public void printProcessor();
	
}
//multiple inheritance is not supported by java

class Mobile extends camera implements processor 
{

	@Override
	public void printProcessor() {
		// TODO Auto-generated method stub
		
	}
	
}




public class MyInheritance2 {
	
	public static void main(String args[])
	{
		
		
	}

}

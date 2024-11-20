package com.anpc8232.days;

class Dog
{
	String name;
	String breed;
	int cost;
}
public class InstanceVariables
{
	public static void main(String[] args) 
    {
		Dog d=new Dog();
		d.name="Scooby";
		d.breed="pug";
		d.cost=12000;
		System.out.println(d.name);
		System.out.println(d.breed);
		System.out.println(d.cost);
    }
}



package com.shi;

public class JavaBean {
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public JavaBean() {
		
		
	}
	
	public JavaBean(int roll,String name,int age,int marks) {
		
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
		
	}
	
	public void setRoll(int roll) {
		
		this.roll=roll;
		
	}
	
	public int getRoll() {
		
		return roll;
		
	}
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setAge(int age) {
		
		this.age=age;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setMarks(int marks) {
		
		this.marks=marks;
		
	}
	
	public int getMarks() {
		
		return marks;
		
	}
	
	public void showDetails() {
		
		System.out.println("Roll is :"+roll);
		
		System.out.println("Name is :"+name);
		
		System.out.println("Age is :"+age);
		
		System.out.println("Marks is :"+marks);
		
	}
 

	public static void main(String[] args) {
		
		JavaBean s1 = new JavaBean();
		
		s1.setRoll(81);
		
		s1.setName("Shalu");
		
		s1.setAge(22);
		
		s1.setMarks(200);
		
		JavaBean s2 = new JavaBean(70, "Vinnu", 25, 300);
		
		System.out.println("Student1 details: ");
		
		s1.showDetails();
		
		System.out.println("Student2 details: ");
		
		System.out.println("Roll is :"+s2.getRoll());
		
		System.out.println("Name is :"+s2.getName());
		
		System.out.println("Age is :"+s2.getAge());
		
		System.out.println("Marks is :"+s2.getMarks());

	}

}

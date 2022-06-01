package com.shi;

public class Student {
	
	int roll;
	
	String name;
	
	String address;
	
	String collageName;
	
	public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCollageName() {
    	return collageName;
    }
    
    public void setCollageName(String collageName) {
    	this.collageName = collageName;
    }

    Student(){

    }
    
    void nit(){
    	setRoll(123);
        setName("Ram");
        setAddress("xyz");
        setCollageName("AEC");
    }
}

class Main1 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
        s1.nit();
        System.out.println(s1.getRoll());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        System.out.println(s1.getCollageName());
	}

}

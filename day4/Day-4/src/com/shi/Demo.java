package com.shi;

public class Demo {
    int x = 15;
    String name = "xyz";
    String Add = "mno";

  public Demo(){
      int x = 25;
      String name = "xyzxyz";
      String Add = "mno";

      System.out.println("inside the construction");

   }
  
   public Demo(int x ,String name,String add){
      this.Add = add;
      this.name = name;
      this.x = x;

   }
   Demo(int i){

   }

   Demo(float f){

   }

   public void showdetails(){
       System.out.println(Add);
       System.out.println(name);
       System.out.println(x);
   }


}

class Main{
   public static void main(String[] args) {
       Demo d1 = new Demo();
       Demo d2 = new Demo(15,"wxy","abc");
       d2.showdetails();
       Demo d3 = new Demo(5);
       Demo d4 = new Demo(4f);

   }
}
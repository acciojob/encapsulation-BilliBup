package com.driver;

public class Main {
  public static void main(String []args){
      RWOnly obj = new RWOnly();
      // obj.name Error: make package private or name a protected or public

      String gotname = "Shrishty";
      obj.setName(gotname);
      System.out.println(obj.getName());
  }
}
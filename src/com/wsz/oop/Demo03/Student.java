package com.wsz.oop.Demo03;

public class Student extends Person{
    public void outAmount(){
        System.out.println(super.getAmount());
    }
    public void outHigh(){
        System.out.println(super.high);
    }
}

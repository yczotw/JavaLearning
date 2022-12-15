package com.wsz.oop.Demo05;

public class Student {
    {
        System.out.println("匿名代码块");
    }
    static{
        System.out.println("静态代码块");
    }

    public Student() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}

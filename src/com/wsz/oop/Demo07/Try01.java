package com.wsz.oop.Demo07;

public class Try01 {
    public static void main(String[] args) {
//        Person person = new Person();

        Student student = new Student();
        student.test();

    }
}
class Person{
    int a = 2;
    void test(){
        System.out.println();
    }
}

class Student extends Person{
    int b = 1;
}
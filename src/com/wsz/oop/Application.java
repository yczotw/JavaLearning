package com.wsz.oop;

import com.wsz.oop.Demo03.Person;
import com.wsz.oop.Demo03.Student;
import com.wsz.oop.Demo04.A;
import com.wsz.oop.Demo04.B;

public class Application {
    public static void main(String[] args) {
//        A a = new A();
//        ((B)a).say();
//
//        B b = new A();
//        ((A) b).eat();
        Student student = new Student();
        Person person = new Person();
        Student s = (Student) person;
        Object o = new Object();
        System.out.println(student instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Student);

    }
}

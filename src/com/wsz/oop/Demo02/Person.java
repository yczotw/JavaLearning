package com.wsz.oop.Demo02;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<120&&age>0){
            this.age = age;
        }else {
            System.out.println("年龄错误");
        }

    }
}

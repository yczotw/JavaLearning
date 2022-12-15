package com.wsz.oop.Demo03;

public class Person {

    private int amount = 10_0000_0000;
    protected int high = 175;
    public void say(){
        System.out.println("我在说话！");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

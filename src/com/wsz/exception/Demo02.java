package com.wsz.exception;

public class Demo02 {
    public static void main(String[] args) {
        try {
            new Demo02().test(1,0);
        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
        }
    }

    public void test(int a,int b){
//        if (b==0){
//            throw new ArithmeticException();
//        }
        System.out.println(a/b);
    }
}

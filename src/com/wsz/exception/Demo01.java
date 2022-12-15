package com.wsz.exception;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误栈信息
        } finally {
            System.out.println("finally");
        }
    }
}

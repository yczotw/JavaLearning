package com.wsz.test;

public class Demo7JieChen {
    public static void main(String[] args) {
        int sum = f(3);
        System.out.println(sum);
    }

    public static int f(int x){
        if (x==1){
            return 1;
        }else {
            return x*f(x-1);
        }
    }
}

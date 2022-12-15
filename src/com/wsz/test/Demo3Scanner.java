package com.wsz.test;

import java.util.Scanner;

public class Demo3Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入的东西："+str);
        }else {
            System.out.println("空");
        }
        scanner.close();//IO流的类不关闭会一直占用资源
    }
}

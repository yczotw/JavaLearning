package com.wsz.test;

import java.util.Scanner;

public class Demo4switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str){
            case "wsz":
                System.out.println("ok");
                break;
            case "吴舒喆":
                System.out.println("对的");
                break;
            default:
                System.out.println("x");
        }
        scanner.close();
    }
}

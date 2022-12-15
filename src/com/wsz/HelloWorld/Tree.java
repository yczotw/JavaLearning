package com.wsz.HelloWorld;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        double a,b,c,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        a = sc.nextDouble();
        System.out.println("b=");
        b = sc.nextDouble();
        System.out.println("c=");
        c = sc.nextDouble();

        s = getMj(a,b,c);
        if(s!=-1){
            System.out.println("s="+s);
        }else {
            System.out.println("无法构成三角形！");
        }
    }

    private static double getMj(double a,double b,double c){
        double s,p;
        if(a+b>c&&a+c>b&&b+c>a){
            p = (a+b+c)/2;
            s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }else {
            s = -1;
        }
        return s;
    }
}

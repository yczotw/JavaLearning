package com.wsz.test;

public class Demo6for {
    public static void main(String[] args) {
//        int j = 0;
//        for (int i = 0; i <= 100; i++) {
//            if (i%5==0){
//                System.out.print(i+"\t");
//                j++;
//                if (j%3==0){
////                    System.out.print("\n");
//                    System.out.println();
//                }
//            }
//
//        }

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+"*"+i+"="+(j*i)+"\t");
//            }
//            System.out.print("\n");
//        }

//        int[] num = {1,2,3,4,5};
//        for (int x:num){
//            System.out.println(x);
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print("*");
            }
            for (int i2 = 1; i2 < i; i2++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

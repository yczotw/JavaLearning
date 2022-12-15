package com.wsz.test;

import java.util.Arrays;

/***
 * @author wushuzhe
 * @version 1.0
 */
public class Demo8ShuZu {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for (int i:arr){
//            System.out.println(i);
//        }

        int[][] array = {{1,2},{3,4},{5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
        
    }
}

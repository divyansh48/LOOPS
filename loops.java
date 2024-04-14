package com.divyansh;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        /*
        syntax of for loop
        for (initialization ; condition check : increament or decreamenet) {
                //body
        }
         */

//        for (int i = 1 ; i <= 6 ; i++) {
//            System.out.println(i);
//        }

        /*
        for printing numbers from 1 to n
         */

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }

//        while loops
//        syntax for while loop
//        while (condition) {
                   //body
//            }

//        int i = 0;
//        while (i <= 6) {
//            System.out.println(i);
//            i++;
//
//        }

        /*
        do while loop
        syntax:

        do{
          // body
        } while(condition);



         */

        int n = 1;
        do {
            System.out.println(n);
            n ++;

        } while (n<=7);
    }
}

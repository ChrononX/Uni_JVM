package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 1000;
        int c = (a % 1000) / 100;
        int d = (a % 100) / 10;
        int e = (a % 10);
//        System.out.println(a / 1000);
//        System.out.println((a % 1000) / 100);
//        System.out.println((a % 100) / 10);
//        System.out.println(a % 10);
        System.out.println(b + c + d + e);

    }
}

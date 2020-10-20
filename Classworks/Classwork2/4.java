package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a / 100);
        System.out.println((a % 100)/10);
        System.out.println((a%10));
    }
}

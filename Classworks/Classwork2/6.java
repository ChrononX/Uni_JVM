package com.company;

import java.util.Scanner;


public class Main {

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int g = gcd(a, b);
        System.out.println("udidesigamyofi(" + a +  " , " + b+ ") = " + g);


    }
}

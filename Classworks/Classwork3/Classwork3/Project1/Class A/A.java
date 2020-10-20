package com.company;

import java.util.Scanner;

public class A {
    private int a, b;

    public void Method1() {
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

    }

    public void Method2() {
        System.out.println(a + b);

    }

    public int Method3() {
        return a*b;


    }
}

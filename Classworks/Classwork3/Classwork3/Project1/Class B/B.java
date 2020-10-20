package com.company;

import java.util.Scanner;

public class B {
    private int a, b, c;

    public void Method1() {
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }

    public void Method2(){
        System.out.println(Math.max(a,Math.max(b,c)));

    }
    public int Method3(){
        return Math.min(a,Math.min(b,c));

    }
}

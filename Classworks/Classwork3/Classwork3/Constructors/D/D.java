package com.company;

public class D {
    int x = 4;
    int y = -5;


    D() {
        System.out.println("Hello my class");
    }

    public void Method1() {
        if (x > 0) {
            System.out.println(4 * x - y);
        if (y <= 0) {
            System.out.println(2 * x + y);
            }
        }
    }

    public void Method2() {
        if (y > 0){
            System.out.println(4*x+y);
        if (y <= 0){
            System.out.println(2*x-y);
            }
        }
    }
}

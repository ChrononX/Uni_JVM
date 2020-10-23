package com.company;

import java.util.Scanner;

public class C {
    int a = 10;
    int b = 9;
    char s = '#';
    char h = '@';

    void Method1() {
        System.out.println(this.a + " " + this.b);
    }

    void Method2() {
        System.out.println(this.s + " " + this.h);
    }

    void Method3() {
        System.out.println(this.a + this.b);
        System.out.println(this.a * this.b);
        System.out.println(this.a - this.b);

        try {
            System.out.println(this.a % this.b);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by zero");
        }
    }
    void Method4(){
        Scanner input=new Scanner(System.in);
        System.out.println("Input a: ");
        this.a = input.nextInt();
        System.out.println("Input b: ");
        this.b = input.nextInt();
    }
    void Method5(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Char: ");
        this.s = input.next().charAt(0);

        System.out.println("Enter Char: ");
        this.h = input.next().charAt(0);
    }

}


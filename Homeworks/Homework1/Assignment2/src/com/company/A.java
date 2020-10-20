package com.company;

import java.util.Scanner;

public class A {
    int x,y;

    A() {
        System.out.println("Hello");
    }

    public void Method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ X: ");
        x = scanner.nextInt();
    }

    public int Method2() {
        return x + 12;
    }

    public void Method3() {
        if (x % 2 == 0) {
            System.out.println(x + " არის ლუწი.");
        } else {
            System.out.println(x + " არის კენტი.");
        }
    }
    public int B(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ Y: ");
        y = scanner.nextInt();
        return x+y;
    }
}

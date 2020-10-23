package com.company;

import java.util.Scanner;
import java.util.Random;

public class B {
    public int a=33;
    double b = 9.7;
    char s = '#';

    public char Method1(){
        return this.s;
    }
    public double Method2(){
        return this.b;
    }
    public void Method5(){
        System.out.println(a);
    }

    public void Method3(){
        System.out.println(this.a - b);
    }
    public void Method4(){
        System.out.println(a / b);
    }
    public void Method6(){
        Random random = new Random();
        this.a = random.nextInt();
        this.b = random.nextDouble();
        this.s = (char) (random.nextInt(22) + 'd');

    }
    public void Method7(){
        Scanner input=new Scanner(System.in);
        System.out.println("Input a: ");
        this.a = input.nextInt();
    }
    void Method8(){
        System.out.println(this.b + 10);
    }
}

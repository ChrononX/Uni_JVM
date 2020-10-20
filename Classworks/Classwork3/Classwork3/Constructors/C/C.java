package com.company;

public class C {
    int x,b,a;

    public C(){
    }

    public C(int num1,int num2, int num3){
        x = num1;
        a = num2;
        b = num3;
    }

    public void  Method1(){
        if (a < b) System.out.println("შუალედშია");
        else System.out.println("არ არის შუალედში");

    }
    public void Method2(){
        if (x >= a && x <= b)
            System.out.println("შუალედშია");
    }
}


package com.company;

import java.util.Scanner;

public class C {
    private int a, b, c;

    public void Method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("ჩაწერეთ მთელი რიცხვი: ");
        a = input.nextInt();
        System.out.println("ჩაწერეთ მთელი რიცხვი: ");
        b = input.nextInt();
        System.out.println("ჩაწერეთ მთელი რიცხვი: ");
        c = input.nextInt();

    }

    public int Method2() {
        return a % 10;
    }
    public int Method3(){
        while (b >= 10){
            b = b / 10;
        }
        return b;
    }
    public int Method4(){
        int sum = 0;
        while (c > 0){
            sum += c % 10;
            c /= 10;
        }
        return(sum);
    }
    public int Method5(){
        return Method2() * Method3();
    }
    public int Method6(){
        return Method3() + Method5();
    }
}
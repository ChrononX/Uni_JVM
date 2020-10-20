package com.company;

import java.util.Scanner;

public class C {
    private int a, b, c;

    public void Method1() {
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }
    public int Method2(){
        return(a%10);
    }
    public int Method3(){
        return(b = Integer.parseInt(Integer.toString(b).substring(0, 1)));
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
       return Method2()*Method3();

    }
    public int Method6(){
        return Method3()+Method5();

    }
}

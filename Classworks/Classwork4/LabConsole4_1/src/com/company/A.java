package com.company;

public class A {
    public int a=10, b=29;

    public void Method1(){
        System.out.println("Hello OPP");
    }
    public void Method2(){
        System.out.println(a);
    }
    public void Method3(){
        System.out.println(b);
    }
    public void Method4(){
        System.out.println(a+b);
    }
    public int Method5(){
        return a + b;
    }
    public int Method6(){
        return a*b;
    }
    public void Method7(){
        this.a = 5;
        this.b = 6;
    }
}

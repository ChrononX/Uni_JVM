package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        A myObj = new A();
        myObj.Method1();
        myObj.Method2();
        myObj.Method3();
        myObj.Method4();
        System.out.println(myObj.Method5());
        System.out.println(myObj.Method6());
        myObj.Method7();

        System.out.println("----------------");

        B myObj2 = new B();
        System.out.println(myObj2.Method1());
        System.out.println(myObj2.Method2());
        myObj2.Method3();
        myObj2.Method4();
        myObj2.Method5();
        myObj2.Method6();
        myObj2.Method7();
        myObj2.Method8();

        System.out.println("----------------");

        C myObj3 = new C();
        myObj3.Method1();
        myObj3.Method2();
        myObj3.Method3();
        myObj3.Method4();
        myObj3.Method5();

    }
}

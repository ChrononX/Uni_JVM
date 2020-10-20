package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        C MyObj1 = new C ();
        MyObj1.Method1();
        System.out.println("a-ს ბოლო ციფრია: " + MyObj1.Method2() + "\n");
        System.out.println("b-ს პირველი ციფრია: " + MyObj1.Method3() + "\n");
        System.out.println("c-ს ციფრთა ჯამია: " + MyObj1.Method4() + "\n");
        System.out.println("მეთოდი2 x მეთოდი3: " + MyObj1.Method5() + "\n");
        System.out.println("მეთოდი3 + მეთოდი5: " + MyObj1.Method6() + "\n");
    }
}

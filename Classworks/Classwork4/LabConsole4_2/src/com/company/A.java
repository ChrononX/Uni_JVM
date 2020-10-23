package com.company;

import java.util.Random;

public class A {
    int a;
    int b;
    int[] m = new int[12];

    void Method1() {
        Random random = new Random();
        this.a = random.nextInt(16) + 10;
        this.b = random.nextInt(16) + 10;
        System.out.println(a + " " + b);
    }

    public void Method2() {
        System.out.println("პირველი მეთოდი ასრულებს მეორე მეთოდის ფუნქციასაც.");
    }

    void Method3() {
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            int randomNumber = random.nextInt(71) - 10;
            this.m[i] = randomNumber;
        }
    }

    public void Method4() {
        for (int num : this.m) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    void Method5(){
            int sum = 0;
            for(int num : this.m){
                if(num > 0){
                    sum = sum + num;
                }
            }

            if (sum > 0) {
                System.out.println("დადებითების ჯამია: " + sum);
            } else {
                System.out.println("არ არის დადებითი რიცხვები");
        }
    }

}

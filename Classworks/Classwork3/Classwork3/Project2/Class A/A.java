package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A {
    int m[];

    public void Method1() {

        Scanner s = new Scanner(System.in);
        m = new int[10];
        System.out.println("Enter 10 Numbers: ");

        for (int i = 0; i < 10; i++) {
            m[i] = s.nextInt();

        }
        System.out.println(Arrays.toString(m));
    }

    public void Method2() {
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            m[i] = r.nextInt(15);
        }
        System.out.println(Arrays.toString(m));
    }
    public int Method3() {
        int sum = 0;

        for (int i = 0; i < 10; i++){
            if ( m[i] < i) sum += m[i];
        }
        return sum;
    }
    public int Method4() {
        int multiply = 1;

        for (int i = 0; i < 10; i++){
            if ( m[i] > i) multiply *= m[i];
        }
        return multiply;
    }
}


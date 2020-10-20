package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {
    double m[];

    public void Method1() {

        Scanner s = new Scanner(System.in);
        m = new double[10];
        System.out.println("Enter 10 Numbers: ");

        for (int i = 0; i < 10; i++) {
            m[i] = s.nextDouble();

        }
        System.out.println(Arrays.toString(m));
    }

    public void Method2() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            m[i] = r.nextInt(15);
        }
        System.out.println(Arrays.toString(m));
    }

    public void Method3() {
        System.out.print("[");
        for(int i = 0; i < 10; i ++){
            if (m[i] > 7){
                System.out.print(i+" "+m[i]+", ");
            }
        }
        System.out.println("]");
    }


    public double Method4() {
        double max = m[0];
        double min = m[0];

        for (double num : m){
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        return max - min;
    }
}

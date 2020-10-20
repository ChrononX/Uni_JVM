package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i = input.nextInt();
        int b = input.nextInt();
        while (i < b) {
            System.out.println(i);
            i++;
        }

    }
}

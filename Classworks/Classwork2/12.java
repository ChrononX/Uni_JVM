package com.company;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Num : ");
        int a1 = input.nextInt();
        System.out.println("2nd Number : ");
        int a2 = input.nextInt();
        System.out.println("3rd Number : ");
        int a3 = input.nextInt();
        System.out.println("4th Number : ");
        int a4 = input.nextInt();
        System.out.println("5th Number " );
        int a5 = input.nextInt();
        System.out.println("6th Number : ");
        int a6 = input.nextInt();
        System.out.println("7th Number : ");
        int a7 = input.nextInt();
        System.out.println("8st Number : ");
        int a8 = input.nextInt();
        List<Integer> arr = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);



//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

    }
}

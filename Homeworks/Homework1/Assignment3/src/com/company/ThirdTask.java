package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ThirdTask {
    static void main(){
        int a,b,even,odd;
        int [] RndArr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიტანეთ a: ");
        a = scanner.nextInt();

        System.out.println("შეიტანეთ b: ");
        b = scanner.nextInt();

        if (a < b){
            RndArr = RndNums(a, b, 40);
        }else{
            RndArr = RndNums(b, a, 40);
        }

        System.out.println(Arrays.toString(RndArr));
        System.out.println("მასივში ლუწია: " + CntNums(RndArr,0));
        System.out.println("მასივში კენტია: " + CntNums(RndArr,1));

        even = SumNum(RndArr, 0);
        System.out.println("ლუწების ჯამია: " + even);

        odd = SumNum(RndArr, 0 );
        System.out.println("კენტების ჯამი: " + odd );

        if (even < odd){
            System.out.println(RndNums(even, odd, 5));
        }else{
            System.out.println(RndNums(odd, even, 5));
        }


    }
    private static int[] RndNums(int min, int max, int length){
        int[] RndNumArr = new int[length];

        Random random = new Random();

        for (int i = 0; i < length; i++){
            int RndNum = random.nextInt(max - min + 1) + min;
            RndNumArr[i] = RndNum;
        }
        return RndNumArr;
    }
    private static int CntNums(int[] array, int remainder){
        int total = 0;

        for (int num: array){
            if (num % 2 == remainder){
                total++;
            }
        }
        return total;
    }
    private static int SumNum(int[] array, int remainder){
        int sum = 0;

        for(int num : array){
            if (num % 2 == remainder){
                sum = sum + num;
            }
        }
        return sum;
    }
}

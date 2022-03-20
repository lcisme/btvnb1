package com.company;

import java.util.Scanner;

public class bai2cach2 {
    public static void main(String[] args){
        System.out.println("Nhap so n ban muon: ");
        Scanner abc = new Scanner(System.in);
        int n;
        n = abc.nextInt();
        System.out.println("So Fibonacci thu "+ n +" la " + checkfibonacci(n) );
    }
    public  static int checkfibonacci(int n){
        int f1,f2,f3;
        f1=f2=f3=1;
        for (int i=3;i<=n;i++){
            f1=f2 + f3;
            f2=f3;
            f3=f1;
        }
        return f1;
    }
}

package com.company;

import java.util.Scanner;

public class bai1cach2 {

    public static void main(String[] args) {
        System.out.println("Nhap so bat ki: ");
        Scanner abc = new Scanner(System.in);
        int x;
        x = abc.nextInt();
        if (checkSHH(x)){
            System.out.println(x + " la so hoan hao");
        }
        else {
            System.out.println(x + " khong phai so hoan hao");
        }
    }
    public static boolean checkSHH(int x) {
        int tong = 0;
        for (int i=1; i<x;i++) {
            if (x%i==0)
                tong+=i;
        }
        if (tong == x){
            return true;
        }
        return false;
    }
}


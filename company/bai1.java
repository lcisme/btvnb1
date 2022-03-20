package com.company;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nhap so bat ki: ");
        Scanner abc = new Scanner(System.in);
        int x;
        x = abc.nextInt();
        int tong = 0;
        for (int i=1;i<x;i++){
            if (x%i==0) {
                tong+=i;
            }
        }
        if (tong == x){
            System.out.println(x + " la so hoan hao");
        }
        else {
            System.out.println(x + " khong phai so hoan hao");
        }
    }

}

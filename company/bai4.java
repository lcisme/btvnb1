package com.company;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        int so1,so2;
        Scanner abc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        so1 = abc.nextInt();
        System.out.println("Nhap so thu hai");
        so2 = abc.nextInt();
        int ucln = 0;
        if (so1>so2){
            for (int i=1;i <=so2;i++){
                if (so1%i==0 && so2%i==0){
                    if (i>ucln){
                        ucln=i;
                    }
                }
            }
        }
        else if (so1 == so2){
            for (int i=1; i<=so2;i++){
                if (so1%i==0 && so2%i==0){
                    if (i>ucln){
                        ucln=i;
                    }
                }
            }
        }
        else {
            for (int i=1;i <=so1;i++){
                if (so1%i==0 && so2%i==0){
                    if (i>ucln){
                        ucln=i;
                    }
                }
            }
        }
        System.out.println("Uoc chung lon nhat cua "+so1+" va "+so2+" la "+ucln);
        System.out.println("Boi chung nho nhat cua "+so1+" va "+so2+" la "+(so1*so2)/ucln);
    }
}

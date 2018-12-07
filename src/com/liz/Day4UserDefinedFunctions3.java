package com.liz;

import java.util.Scanner;

public class Day4UserDefinedFunctions3 {
    public static void main(String[] args) {
        Scanner chukua;
        chukua=new Scanner(System.in);
        double fnum,snum;
        System.out.println("Enter the first number");
        fnum=chukua.nextDouble();
        System.out.println("Enter the second number");
        snum=chukua.nextDouble();
        product(fnum,snum);

    }
    public static double product(double num1,double num2){
        double jibu=num1*num2;
        System.out.println("Your product is"+jibu);
        return jibu;

    }
}

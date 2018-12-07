package com.liz;

public class Day4UserDefinedFunctions2 {
    public static void main(String[] args) {
        ongeza(20 ,87);//Parse A parameter
        zidisha(34,43);

    }
    public static Integer ongeza(int x,int y){
        int jibu= x+y;
        System.out.println(jibu);
        return jibu;


    }
    public static Double zidisha(double x,double y){
        double jibu=x*y;
        System.out.println(jibu);
        return jibu;
    }
}

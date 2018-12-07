package com.liz;

public class Day4MethodOverloading {
    public static void main(String[] args) {
        noma("king","Wanyama");
        noma(34.0,23);

    }
    public static String noma(String x,String y){
        String jibu=x+y;
        System.out.println(jibu);
        return jibu;
    }
    public static double noma(double x,double y){
        double jibu=x+y;
        System.out.println(jibu);
        return jibu;

    }
}

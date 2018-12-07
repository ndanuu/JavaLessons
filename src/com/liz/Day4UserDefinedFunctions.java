package com.liz;

public class Day4UserDefinedFunctions {
    public static void main(String[] args) {
        //You cannot put a function inside a function
        motto();
        motto();
        motto();//calling the function motto
        hesabu();
        Jina();
    }
    public static void  motto(){
        System.out.println("Hello, This is our motto!!!");
    }
    public static void hesabu(){
        int x,y,z;
        x=10;
        y=30;
        z=x+y;
        System.out.println(z);
    }
    public static String Jina(){
        String x= "Hello King";
        System.out.println(x);
        return x;
    }
}

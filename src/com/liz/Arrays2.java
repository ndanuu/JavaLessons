package com.liz;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        String[] names;
        Scanner chukua;
        int number;
        chukua=new Scanner(System.in);
        System.out.println("How many names do you have?");
        number=chukua.nextInt();
        names=new String[number];
        System.out.println("Enter the "+number+ "names");
        for(int x=0; x<number; x++){
            names[x]=chukua.next();
            System.out.println("Enter the next name");
        }
        for(int x=0; x<number; x++){
            System.out.println(names[x]);
        }


    }
}

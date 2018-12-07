package com.liz;

import java.util.ArrayList;

public class Day4MoviesClass {
    public static void main(String[] args) {
        ArrayList<Day4Item>list;
        list=new ArrayList<>();
        Day4Item movie;
        movie= new Day4Item("King",2018,5);
        list.add(movie);

        movie = new Day4Item("Onesmus",2016,4);
        list.add(movie);

        movie =new Day4Item("Liz",2012,3);
        list.add(movie);

        System.out.println(list.toString());
        //NAME EMAIL PASSWORD
        //STUDENT ADMISSION DORM.
    }
}

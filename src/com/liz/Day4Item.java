package com.liz;

import java.time.Year;

public class Day4Item {
    String actor;
    int year,rating;

    public Day4Item(String actor, int year, int rating) {
        this.actor = actor;
        this.year = year;
        this.rating = rating;
    }
    public String toString(){
        return "\nName ="+actor+"\nYear = "+ year +"\nRating = "+rating+"\n\n";
    }
}

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of the weekday");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        if (day>7 || day< 1){
            System.out.println("That is not a weekday");
        }
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("Sunday");

        }

        }
    }

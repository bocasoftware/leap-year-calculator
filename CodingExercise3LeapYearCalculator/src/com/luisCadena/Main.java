package com.luisCadena;

public class Main {

    public static void main(String[] args) {


        System.out.println(isLeapYear(1600));


    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999)

            //A leap year is divisible by 4 but not by 100 or is divisible by 400
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

        return true;
        }

        return false;
    }
}

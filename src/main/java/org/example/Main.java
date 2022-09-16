package org.example;

import java.lang.String;

public class Main {


    public static int a = 7;
    public static int b = 6;
    public static int c = 4;

    public static String kindOfTriangle (int a, int b, int c){
        if(a==b && b==c){
            return "equilateral";
        }

        else if(a==b || a == c || b == c){
            return "isosceles";
        }

        

        return "";
    }

    public static void main(String[] args) {


        System.out.println(kindOfTriangle(a, b, c));
    }
}
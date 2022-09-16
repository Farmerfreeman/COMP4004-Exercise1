package org.example;

import java.lang.String;

public class Main {




    public static String kindOfTriangle (int a, int b, int c){
        if(a > 20 || b > 20 || c > 20 || a < 0 || b < 0 || c < 0 || a >= b + c || b >= a + c || c >= a + b){
            return "invalid";
        }

        else if(a==b && b==c){
            return "equilateral";
        }

        else if(a==b || a == c || b == c){
            return "isosceles";
        }

        else if(a != b && a != c && b != c){
            return "scalene";
        }

        return "";
    }

    public static void main(String[] args) {



    }
}
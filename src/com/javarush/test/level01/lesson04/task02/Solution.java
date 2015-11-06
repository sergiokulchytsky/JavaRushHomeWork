package com.javarush.test.level01.lesson04.task02;

import java.lang.String;

/* Когда я вырасту, то хочу быть паровым экскаватором!
Напиши программу, которая выводит на экран надпись: «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Когда я вырасту, то хочу быть паровым экскаватором!";
        print5Times(s);
        print5Times(s);
    }


    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}

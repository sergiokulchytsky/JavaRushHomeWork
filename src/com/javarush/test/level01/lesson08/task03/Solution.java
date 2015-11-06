package com.javarush.test.level01.lesson08.task03;

/* Слава Роботам!
Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Слава Роботам! Убить всех человеков!";

        print4Times(s);
        print4Times(s);
        print4Times(s);
        print4Times(s);
    }

    public static void print4Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}

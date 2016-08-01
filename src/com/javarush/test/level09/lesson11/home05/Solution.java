package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = reader.readLine().toCharArray();

        String firstRow = "";
        String secondRow = "";

        for (char c : chars) {
            if (isVowel(c)) {
                firstRow += c + " ";
            } else if (c != ' '){
                secondRow += c + " ";
            }
        }

        System.out.println(firstRow.trim());
        System.out.println(secondRow.trim());
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}

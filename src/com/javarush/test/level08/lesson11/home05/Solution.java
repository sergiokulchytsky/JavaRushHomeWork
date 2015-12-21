package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] letters = s.toCharArray();

        if (Character.isLetter(letters[0]) && Character.isLowerCase(letters[0])) {
            letters[0] = Character.toUpperCase(letters[0]);
        }

        for (int i = 1; i < letters.length; i++) {
            if (Character.isLetter(letters[i]) && Character.isSpaceChar(letters[i-1])) {
                letters[i] = Character.toUpperCase(letters[i]);
            }
        }

        s = String.valueOf(letters);
        System.out.println(s);
    }


}

package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int number = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(number).length() < list.get(i).length()){
                number = i;
            }
        }

        for (String s : list) {
            if (s.length() == list.get(number).length()){
                System.out.println(s);
            }
        }
    }
}

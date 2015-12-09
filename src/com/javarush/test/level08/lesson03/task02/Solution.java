package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String[] names = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        String[] types = new String[]{"ягода","трава", "ягода", "фрукт", "овощ", "куст", "корень", "ягода","цветок", "клубень"};

        for (int i = 0; i < names.length; i++) {
            hashMap.put(names[i], types[i]);
        }

        for (Map.Entry<String, String> pair : hashMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}

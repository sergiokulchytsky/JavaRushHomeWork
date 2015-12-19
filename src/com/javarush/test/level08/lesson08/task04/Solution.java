package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone3", new Date("AUGUST 1 1980"));
        map.put("Stallone4", new Date("DECEMBER 1 1980"));
        map.put("Stallone5", new Date("OCTOBER 1 1980"));
        map.put("Stallone6", new Date("NOVEMBER 1 1980"));
        map.put("Stallone7", new Date("MARCH 1 1980"));
        map.put("Stallone8", new Date("OCTOBER 1 1980"));
        map.put("Stallone9", new Date("NOVEMBER 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashSet<String> set = new HashSet<String>();
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            if (entry.getValue().getMonth() >= 5 && entry.getValue().getMonth() <= 7) {
                set.add(entry.getKey());
            }
        }

        for (String s : set) {
            map.remove(s);
        }
    }

}

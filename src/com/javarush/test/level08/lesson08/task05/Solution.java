package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("LastName1","FirstName1");
        map.put("LastName2","FirstName2");
        map.put("LastName3","FirstName3");
        map.put("LastName4","FirstName4");
        map.put("LastName5","FirstName5");
        map.put("LastName6","FirstName1");
        map.put("LastName7","FirstName2");
        map.put("LastName8","FirstName3");
        map.put("LastName9","FirstName6");
        map.put("LastName10","FirstName7");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> hashMap = new HashMap<String, String>(map);
        HashSet<String> set = new HashSet<String>();

        for (String s : hashMap.values()) {
            if (set.contains(s)) {
                removeItemFromMapByValue(map, s);
            } else {
                set.add(s);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}

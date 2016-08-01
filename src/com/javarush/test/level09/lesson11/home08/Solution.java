package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();

        int[] arr = {5, 2, 4, 7, 0};

        for (int num : arr) {
            int[] array = new int[num];

            for (int number : array) {
                number = 1;
            }

            arrayList.add(array);
        }

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array: list ) {
            for (int x: array) {
                System.out.println(x);
            }
        }
    }
}

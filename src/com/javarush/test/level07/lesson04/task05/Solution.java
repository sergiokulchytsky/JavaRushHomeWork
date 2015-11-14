package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] largeArray = new int[20];
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = largeArray[i];
            secondArray[i] = largeArray[largeArray.length/2 + i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
    }
}

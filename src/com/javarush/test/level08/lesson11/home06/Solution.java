package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("child1", true, 10, new ArrayList<Human>());
        Human child2 = new Human("child2", true, 10, new ArrayList<Human>());
        Human child3 = new Human("child3", true, 10, new ArrayList<Human>());

        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("father", true, 35, childs);
        Human mother = new Human("mother", false, 35, childs);

        ArrayList<Human> fatherList = new ArrayList<Human>();
        ArrayList<Human> motherList = new ArrayList<Human>();

        fatherList.add(father);
        motherList.add(mother);

        Human gFather1 = new Human("gFather1", true, 55, fatherList);
        Human gFather2 = new Human("gFather2", true, 65, motherList);
        Human gMother1 = new Human("gMother1", true, 65, fatherList);
        Human gMother2 = new Human("gMother2", true, 65, motherList);

        System.out.println(gFather1);
        System.out.println(gFather2);
        System.out.println(gMother1);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        private String name;
        private Boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}

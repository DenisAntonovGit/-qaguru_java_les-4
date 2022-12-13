package com.denisantonov;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // целые числа
        byte varByte = 0; // -128 ... 127
        short varShort = 0; // -32768 ... 32767
        // must have
        int varInt = 0; // -2147483648 .. 2147483647
        long varLong = 0L; //

        // числа с плавающей точкой
        float varFloat = 0.0f;
        // must have
        double varDouble = 0.0d;

        //  логический
        boolean varBool = true; //false

        // символьный
        char varChar = '0';

        String varStr = null;

        //ОПЕРАТОРЫ
        // 1. Присвоения
        int varInt0 = 0;
        varInt0 += 10;

        // 2. Математические + - * % / ++ --
        varInt0 = ++varInt0;

        // 3. Сравнения >, <, >=, <=, !=, ==
        if (1 != 1);

        // 4. Логические операторы &&, ||, !
        //if (age > 30 && sex.equals("female")) {

        System.out.println((varInt0));



        // несколько способов создания массивов
        int[] intArray = new int[]{1, 42, -100};
        int[] intArray0 = new int[3];
        intArray0[0] = 1;
        intArray0[1] = 42;
        intArray0[2] = -100;


        // Цикл for проходит по элементам массива начиная с первого элемента
        for (int i = 0; i < intArray0.length; i++) {
            System.out.println(i + "-й элемент массива " + intArray0[i]);
        }
        // Цикл for проходит по элементам массива начиная с последнего элемента
        for (int i = intArray0.length - 1; i >= 0; i--) {
            System.out.println(i + "-й элемент массива " + intArray0[i]);
        }
        // Выход из цикла с помощью break
        for (int i = 0; i < intArray0.length; i++) {
            if (intArray0[i] == -100) {
                System.out.println("Нашли " + intArray0[i]);
                break;
            }
            System.out.println("Next iteration");
        }

        //исполльзование continue для пропуска интерации
        for (int i = 0; i < intArray0.length; i++) {
            if (intArray0[i] != -100) {
                continue;
            }
            System.out.println("Нашли " + intArray0[i]);
            break;
        }

        //другой вариант использования цикла (аналог foreach)
        for (int element : intArray0) {
            if (element == -100) {
                System.out.println("Нашли " + element);
                break;
            }
            System.out.println("Next element");
        }

        boolean founded = false;
        while (!founded) {
            //do smth (search process)
            founded = true;
        }

        do {

        } while (!founded);

        //Коллекция List. Пример
        List<Integer> listOfInteger = List.of(1, 42, -100);
        listOfInteger.stream()
                .filter(e -> e == -100)
                .findFirst()
                .orElseThrow();

        //Коллекция Set. Пример
        Set<String> stringSet = Set.of("Denis", "Java", "Lesson 9");

        //Коллекция Map. Пример
        Map<String, Integer> theMap = Map.of(
                "Denis", 422456,
                "Darya", 553311
        );

        Set<String> keySet = theMap.keySet();
        Collection<Integer> values = theMap.values();
        Set<Map.Entry<String, Integer>> entries = theMap.entrySet();


        System.out.println("Длина массива" + " " + intArray0.length);
        System.out.println("Содержимое массива" + " " + Arrays.toString(intArray0));
    }
}
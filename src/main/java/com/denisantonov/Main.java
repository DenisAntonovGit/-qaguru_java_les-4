package com.denisantonov;

public class Main {
    public static void main(String[] args) {
        // целые числа
        byte varByte = 0; // -128 ... 127
        short varShort = 0; // -32768 ... 32767
        // must have
        int varInt = 0; //
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



        System.out.println("Hello World");
        System.out.println((varInt0));
    }
}

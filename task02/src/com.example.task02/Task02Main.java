package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if(monthNumber == 1 || monthNumber == 12 || monthNumber == 2) return "зима";
        if(monthNumber >= 3 && monthNumber <= 5) return "весна";
        if(monthNumber >= 6 && monthNumber <= 8) return "лето";
        return "осень";

        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}
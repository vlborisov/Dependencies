package ru.sportmaster;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.swapCase;

public class Main {
    public static void main(String[] args) {
        String string = input();
        outputReverseString(string);
        outputSwapCase(string);
    }

    public static String input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return in.nextLine();
    }

    public static void outputReverseString(String string) {
        System.out.printf("Введенная строка: %s\nПеревернутая строка: %s\n", string, reverse(string));
    }
    public static void outputSwapCase(String string) {
        System.out.printf("Введенная строка: %s\nСтрока с реверснутыми регистрами: %s", string, swapCase(string));
    }

}
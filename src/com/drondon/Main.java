package com.drondon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введи число!!!!:");
            int result = scanner.nextInt();
            if ("exit".equals(result)) {
                System.out.println("Пока!");
                return;
            }
            System.out.println("Число : " + ((result % 2 == 0) ? "четное" : "нечетное"));
        }
    }
}

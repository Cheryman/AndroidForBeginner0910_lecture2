package com.drondon;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введи true или false!!!!:");
            String result = scanner.nextLine();
            if ("exit".equals(result)) {
                System.out.println("Пока!");
                return;
            }

            boolean value = Boolean.valueOf(result);
            System.out.println("Value: " + value);
        }
    }
}
